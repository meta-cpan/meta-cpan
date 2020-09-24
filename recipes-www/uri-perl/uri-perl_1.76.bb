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

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/URI-1.76.tar.gz"

SRC_URI[md5sum] = "c236e0142adecc1b1104da664bc43a79"
SRC_URI[sha256sum] = "b2c98e1d50d6f572483ee538a6f4ccc8d9185f91f0073fd8af7390898254413e"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
