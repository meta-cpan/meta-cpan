DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-3.005.tar.gz"

SRC_URI[md5sum] = "d5528402f40ad01635d6031c3b580c8e"
SRC_URI[sha256sum] = "6530fbae40c56376db4e6686c34af8da3db5c4baad0d104047b1ef3e24fe2e2a"
RDEPENDS_${PN} += "business-isbn-data-perl"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
