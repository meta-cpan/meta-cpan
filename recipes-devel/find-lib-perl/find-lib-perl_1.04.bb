DESCRIPTION = "The purpose of this module is to replace"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Find-Lib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YA/YANNK/Find-Lib-1.04.tar.gz"

SRC_URI[md5sum] = "bf5619b4ba1945320eccef69b028c453"
SRC_URI[sha256sum] = "1d73921e3061e1b046fe4268e2d05ffd5a4c5762666e2e4723f83aacc146e851"

S = "${WORKDIR}/Find-Lib-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
