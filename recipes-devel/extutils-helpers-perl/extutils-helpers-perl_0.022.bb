DESCRIPTION = "This module provides various portable helper functions for module \
building modules."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Helpers"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Helpers-0.022.tar.gz"

SRC_URI[md5sum] = "cf4fd6f8caa6daac33b1111c9e93162b"
SRC_URI[sha256sum] = "d3f8cf700fb3414ca1260089755cbf64041455e4b744110677b1ba5bb9a3aa95"

S = "${WORKDIR}/ExtUtils-Helpers-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
