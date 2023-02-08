DESCRIPTION = "This module provides functions to encode and decode UTF-8 encoding form as \
specified by Unicode and ISO/IEC 10646:2011."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unicode-UTF8"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHANSEN/Unicode-UTF8-0.62.tar.gz"

SRC_URI[md5sum] = "42bf4a4b881818be3455f11b46952819"
SRC_URI[sha256sum] = "fa8722d0b74696e332fddd442994436ea93d3bfc7982d4babdcedfddd657d0f6"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Unicode-UTF8-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
