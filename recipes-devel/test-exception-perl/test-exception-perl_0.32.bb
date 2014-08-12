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

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADIE/Test-Exception-0.32.tar.gz"

SRC_URI[md5sum] = "50e985a335842540b69ea886eeed8a7f"
SRC_URI[sha256sum] = "ba4427e6004797ece8dce93c61d1d6c82df891b0f017e7d4a5c2505fa05c5a47"
RDEPENDS_${PN} += "sub-uplevel-perl"
DEPENDS += "perl"

S = "${WORKDIR}/Test-Exception-${PV}"



inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
