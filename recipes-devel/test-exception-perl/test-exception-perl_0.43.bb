DESCRIPTION = "This module provides a few convenience methods for testing exception \
based code. It is built with Test::Builder and plays happily with \
Test::More and friends."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Exception"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Exception-0.43.tar.gz"

SRC_URI[md5sum] = "572d355026fb0b87fc2b8c64b83cada0"
SRC_URI[sha256sum] = "156b13f07764f766d8b45a43728f2439af81a3512625438deab783b7883eb533"
RDEPENDS_${PN} += "sub-uplevel-perl"

S = "${WORKDIR}/Test-Exception-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
