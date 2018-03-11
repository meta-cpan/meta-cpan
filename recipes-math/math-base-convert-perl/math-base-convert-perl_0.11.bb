DESCRIPTION = "This module provides fast functions and methods to convert between \
arbitrary number bases from 2 (binary) thru 65535."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Base-Convert"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKER/Math-Base-Convert-0.11.tar.gz"

SRC_URI[md5sum] = "aed8356d8e2870ee1d27a7b6c5752714"
SRC_URI[sha256sum] = "8c0971355f24c93b79e77ad54a4570090a1a598fcb9b86f5c17eba42f38b40e0"

S = "${WORKDIR}/Math-Base-Convert-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
