DESCRIPTION = "Perl modules providing a cryptography based on LibTomCrypt \
<https://github.com/libtom/libtomcrypt> library."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CryptX"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIK/CryptX-0.075.tar.gz"

SRC_URI[md5sum] = "b89c90f93cee04312a96d085b8a8c979"
SRC_URI[sha256sum] = "f4f742d1c165ed337abadaab3ec18d9a05c577a6d635e777b9a4b8809e2cc0f4"

S = "${WORKDIR}/CryptX-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
