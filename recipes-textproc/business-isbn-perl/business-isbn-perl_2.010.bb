DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-2.010.tar.gz"

SRC_URI[md5sum] = "2fd4f8282e81086836ce235550988b75"
SRC_URI[sha256sum] = "247fbb93d31fcb9c2c7f72b541ebac4b5ed88f4a663f78506b93156350a9a991"
RDEPENDS_${PN} += "business-isbn-data-perl"
RDEPENDS_${PN} += "uri-perl"
# use LWP::Simple instead of Mojo::UserAgent
RDEPENDS_${PN} += "libwww-perl-perl"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
