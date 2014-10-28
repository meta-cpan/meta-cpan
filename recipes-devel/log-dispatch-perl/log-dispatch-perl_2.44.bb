DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can \
be logged to via a unified interface."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Log-Dispatch-2.44.tar.gz"

SRC_URI[md5sum] = "a08ad454f77ee6fe0d98e32516b835f2"
SRC_URI[sha256sum] = "fe6c37b3fc28e3dc8ca15f7657d193c1db994e20153391506ca490a6afeef99c"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Log-Dispatch-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
