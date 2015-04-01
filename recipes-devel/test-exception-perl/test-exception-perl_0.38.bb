DESCRIPTION = "This module provides a few convenience methods for testing exception \
based code. It is built with Test::Builder and plays happily with \
Test::More and \
friends."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Exception"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-Exception-0.38.tar.gz"

SRC_URI[md5sum] = "12b8c744ea5caad443b8dee31be16859"
SRC_URI[sha256sum] = "7c6aa4c208c043c38631e2af8d28abf76d32a3dcd2ff4a94591f009a6ed3eab5"
RDEPENDS_${PN} += "sub-uplevel-perl"

S = "${WORKDIR}/Test-Exception-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
