DESCRIPTION = "This module implements the Rijndael cipher, which has just been selected as \
the Advanced Encryption Standard."

SECTION = "libs"
LICENSE = "LGPL-3.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-Rijndael"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-3.0;md5=bfccfe952269fff2b407dd11f2f3083b"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Crypt-Rijndael-1.14.tar.gz"

SRC_URI[md5sum] = "6f0f9d96c97a226bfb73dbc2e4c2d5e1"
SRC_URI[sha256sum] = "6451c3dffe8703523be2bb08d1adca97e77df2a8a4dd46944d18a99330b7850e"

S = "${WORKDIR}/Crypt-Rijndael-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
