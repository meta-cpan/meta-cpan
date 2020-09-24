DESCRIPTION = "You don't need to load this module yourself in most cases. "Business::ISBN" \
will load it when it loads."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN-Data"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-Data-20191107.tar.gz"

SRC_URI[md5sum] = "393d2c45792854ad43eeaf172cb3dbb6"
SRC_URI[sha256sum] = "844c4f64f193d389340b4465a1d5bc34c60f0c8e42e5c69ac8afe3d3bbc5ca0d"

S = "${WORKDIR}/Business-ISBN-Data-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
