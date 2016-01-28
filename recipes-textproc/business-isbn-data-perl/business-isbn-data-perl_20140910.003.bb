DESCRIPTION = "You don't need to load this module yourself in most cases. "Business::ISBN" \
will load it when it loads."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN-Data"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-Data-20140910.003.tar.gz"

SRC_URI[md5sum] = "e45aba8cb0ed856c8633d874a0bf1f5b"
SRC_URI[sha256sum] = "c756048c9b2b76ae5a7b9f1e1f6c59af670ff89b1fa574d4c3d7e4c9659685c9"

S = "${WORKDIR}/Business-ISBN-Data-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
