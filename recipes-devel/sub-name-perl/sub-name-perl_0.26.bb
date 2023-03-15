DESCRIPTION = "This module has only one function, which is also exported by default:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Name"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Sub-Name-0.26.tar.gz"

SRC_URI[md5sum] = "0eb109dfa223e056c07d84c9fbda1762"
SRC_URI[sha256sum] = "2d2f2d697d516c89547e7c4307f1e79441641cae2c7395e7319b306d390df105"

S = "${WORKDIR}/Sub-Name-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
