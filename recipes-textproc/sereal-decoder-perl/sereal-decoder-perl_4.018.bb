DESCRIPTION = "This library implements a deserializer for an efficient, compact-output, \
and feature-rich binary protocol called *Sereal*. Its sister module \
Sereal::Encoder implements an encoder for this format. The two are released \
separately to allow for independent and safer upgrading."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sereal-Decoder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Decoder-4.018.tar.gz"

SRC_URI[md5sum] = "1619ac6237f12dae898be1ee25708933"
SRC_URI[sha256sum] = "2ea4fc5585c2f24d9c1270e50511463eca9aa005941cf2acad24dd516f8fcd71"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-differences-perl-native"
DEPENDS += "test-longstring-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Sereal-Decoder-${PV}"
PARALLEL_MAKE = " "

inherit cpan

BBCLASSEXTEND = "native"
