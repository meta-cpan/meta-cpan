DESCRIPTION = "This module has only one function, which is also exported by default:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Name"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Sub-Name-0.21.tar.gz"

SRC_URI[md5sum] = "7e7a181e30b3249d0b81585f55e36621"
SRC_URI[sha256sum] = "bd32e9dee07047c10ae474c9f17d458b6e9885a6db69474c7a494ccc34c27117"

S = "${WORKDIR}/Sub-Name-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
