DESCRIPTION = "This module abstracts out the process of choosing one of several \
underlying implementations for a module. This can be used to provide XS \
and pure Perl \
implementations of a module, or it could be used to load an \
implementation \
for a given OS or any other case of needing to provide multiple \
implementations."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Implementation"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Module-Implementation-0.07.tar.gz"

SRC_URI[md5sum] = "55483fce4266747e823a1004499bd70c"
SRC_URI[sha256sum] = "7349837153939d7f5777b28f49e2940a0aa003e75f587e1674da5bd5101d2997"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Module-Implementation-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
