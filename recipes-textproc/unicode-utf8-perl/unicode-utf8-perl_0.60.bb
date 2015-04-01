DESCRIPTION = "This module provides functions to encode and decode UTF-8 encoding form \
as specified by Unicode and ISO/IEC 10646:2011."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unicode-UTF8"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CH/CHANSEN/Unicode-UTF8-0.60.tar.gz"

SRC_URI[md5sum] = "68dc4cfe6724944d5d19b6570dc7eab4"
SRC_URI[sha256sum] = "f6ccf25a2a3be9d36d97e014af2f3dda5141c6bb33a130fee2676aaa0fb96ebc"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Unicode-UTF8-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
