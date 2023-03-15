DESCRIPTION = "HMAC is used for message integrity checks between two parties that share a \
secret key, and works in combination with some other Digest algorithm, \
usually MD5 or SHA-1. The HMAC mechanism is described in RFC 2104."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-HMAC"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARODLAND/Digest-HMAC-1.04.tar.gz"

SRC_URI[md5sum] = "746a5edffd1485d7500e005730c271c8"
SRC_URI[sha256sum] = "d6bc8156aa275c44d794b7c18f44cdac4a58140245c959e6b19b2c3838b08ed4"

S = "${WORKDIR}/Digest-HMAC-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
