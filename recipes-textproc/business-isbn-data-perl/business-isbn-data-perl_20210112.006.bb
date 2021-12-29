DESCRIPTION = "You don't need to load this module yourself in most cases. Business::ISBN \
will load it when it loads. You must use Business::ISBN 3.005 or later \
because the data structure changed slightly to fix a bug with ISBN13 \
prefixes."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN-Data"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-Data-20210112.006.tar.gz"

SRC_URI[md5sum] = "a3c6d1ff77eb33d63a35f1a1564530b8"
SRC_URI[sha256sum] = "98c2cfb266b5fdd016989abaa471d9dd4c1d593c508a6f01f66d184d5fee8bae"

S = "${WORKDIR}/Business-ISBN-Data-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
