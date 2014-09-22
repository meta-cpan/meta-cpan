DESCRIPTION = "Test::SharedFork is utility module for Test::Builder."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-SharedFork"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-SharedFork-0.29.tar.gz"

SRC_URI[md5sum] = "acbc5baf82d78edf3771dfecaacd2345"
SRC_URI[sha256sum] = "63af7788cc35b9b7e6fa37c61220ca66abd6364d8bb90c20038e3d8241988a6e"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Test-SharedFork-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
