DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/experimental"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/experimental-0.019.tar.gz"

SRC_URI[md5sum] = "2dbacd15e5a4e0720585da89b4380a0a"
SRC_URI[sha256sum] = "e842ef67f62bcec434fa32f9a7bed1a07cd1508b28e29c11610f191f06fadf56"

S = "${WORKDIR}/experimental-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
