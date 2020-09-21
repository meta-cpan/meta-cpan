DESCRIPTION = "This module provides ways to parse XML documents. It is built on top of \
XML::Parser::Expat, which is a lower level interface to James Clark's expat \
library. Each call to one of the parsing methods creates a new instance of \
XML::Parser::Expat which is then used to parse the document. Expat options \
may be provided when the XML::Parser object is created. These options are \
then passed on to the Expat object on each parse call. They can also be \
given as extra arguments to the parse methods, in which case they override \
options given at XML::Parser creation time."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-Parser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TODDR/XML-Parser-2.46.tar.gz \
	   file://0001-CheckLib.pm-do-not-attempt-to-run-a-cross-executable.patch \
"

SRC_URI[md5sum] = "80bb18a8e6240fcf7ec2f7b57601c170"
SRC_URI[sha256sum] = "d331332491c51cccfb4cb94ffc44f9cd73378e618498d4a37df9e043661c515d"
DEPENDS += "expat"
RDEPENDS_${PN} += "libwww-perl-perl"

S = "${WORKDIR}/XML-Parser-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR} CC='${CC}' LD='${CCLD}' FULL_AR='${AR}'"

inherit cpan

# fix up sub MakeMaker project as arguments don't get propagated though
# see https://rt.cpan.org/Public/Bug/Display.html?id=28632
do_configure_append_class-target() {
	sed -E \
	    -e 's:-L${STAGING_LIBDIR}::g' -e 's:-I${STAGING_INCDIR}::g' \
	    -i Makefile Expat/Makefile
}

do_configure_append() {
	sed -e 's:--sysroot=.*\(\s\|$\):--sysroot=${STAGING_DIR_TARGET} :g' \
	    -i Makefile Expat/Makefile
	sed 's:^FULL_AR = .*:FULL_AR = ${AR}:g' -i Expat/Makefile
	# make sure these two do not build in parallel
	sed 's!^$(INST_DYNAMIC):!$(INST_DYNAMIC): $(BOOTSTRAP)!' -i Expat/Makefile
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

do_compile_class-native() {
	cpan_do_compile
}

BBCLASSEXTEND = "native nativesdk"
