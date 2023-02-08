DESCRIPTION = "This class provides a low-level API for processing MultiPart MIME data \
streams conforming to MultiPart types as defined in RFC 2616 \
<http://tools.ietf.org/html/rfc2616#section-3.7.2>."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-MultiPartParser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHANSEN/HTTP-MultiPartParser-0.02.tar.gz"

SRC_URI[md5sum] = "1b07ebac54ce3288c044a23ba60196d2"
SRC_URI[sha256sum] = "5eddda159f54d16f868e032440ac2b024e55aac48931871b62627f1a16d00b12"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/HTTP-MultiPartParser-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
