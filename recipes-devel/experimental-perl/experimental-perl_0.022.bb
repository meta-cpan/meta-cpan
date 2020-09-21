DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/experimental"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/experimental-0.022.tar.gz"

SRC_URI[md5sum] = "be8915ee924e85ad087ab11911a5b235"
SRC_URI[sha256sum] = "7a2277606b4b16f08af167f98310459315c2bac0b3da89d3e81dc23c9a2c6fb4"

S = "${WORKDIR}/experimental-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
