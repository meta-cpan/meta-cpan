DESCRIPTION = "This module implements the "URI" class. Objects of this class represent \
"Uniform Resource Identifier references" as specified in RFC 2396 (and \
updated by RFC 2732)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.71.tar.gz"

SRC_URI[md5sum] = "247c3da29a794f72730e01aa5a715daf"
SRC_URI[sha256sum] = "9c8eca0d7f39e74bbc14706293e653b699238eeb1a7690cc9c136fb8c2644115"

S = "${WORKDIR}/URI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
