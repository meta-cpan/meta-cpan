DESCRIPTION = "This library implements an efficient, compact-output, and feature-rich \
serializer using a binary protocol called *Sereal*. Its sister module \
Sereal::Decoder implements a decoder for this format. The two are released \
separately to allow for independent and safer upgrading. If you care \
greatly about performance, consider reading the Sereal::Performance \
documentation after finishing this document."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sereal-Encoder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Encoder-4.018.tar.gz"

SRC_URI[md5sum] = "702295dcda16a125be9241909390ea98"
SRC_URI[sha256sum] = "d76c2d1fe9dd54cc627a6e0ffd10782b95a182877d461d5e5958be87f25c2d7d"
DEPENDS += "sereal-decoder-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-differences-perl-native"
DEPENDS += "test-longstring-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Sereal-Encoder-${PV}"
PARALLEL_MAKE = " "

inherit cpan

BBCLASSEXTEND = "native"
