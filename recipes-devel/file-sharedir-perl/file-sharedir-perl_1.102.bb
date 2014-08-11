DESCRIPTION = "The intent of File::ShareDir is to provide a companion to \
Class::Inspector and File::HomeDir, modules that take a process that is \
well-known by \
advanced Perl developers but gets a little tricky, and make it more \
available to the larger Perl community."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ShareDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ShareDir-1.102.tar.gz"

SRC_URI[md5sum] = "553157f0e81cd2dabfe140ceb06cd03f"
SRC_URI[sha256sum] = "7c7334b974882587fbd9bc135f6bc04ad197abe99e6f4761953fe9ca88c57411"
RDEPENDS_${PV} += "class-inspector-perl"
DEPENDS += "file-sharedir-install-perl"

S = "${WORKDIR}/File-ShareDir-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
