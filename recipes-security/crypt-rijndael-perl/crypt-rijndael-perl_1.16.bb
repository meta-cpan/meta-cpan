DESCRIPTION = "This module implements the Rijndael cipher, which has just been selected as \
the Advanced Encryption Standard."

SECTION = "libs"
LICENSE = "LGPL-3.0-only"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-Rijndael"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-3.0-only;md5=bfccfe952269fff2b407dd11f2f3083b"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Crypt-Rijndael-1.16.tar.gz"

SRC_URI[md5sum] = "7dccb639178148d6113cf1fc83b02886"
SRC_URI[sha256sum] = "6540085e3804b82a6f0752c1122cf78cadd221990136dd6fd4c097d056c84d40"

S = "${WORKDIR}/Crypt-Rijndael-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
