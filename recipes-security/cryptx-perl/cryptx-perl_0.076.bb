DESCRIPTION = "Perl modules providing a cryptography based on LibTomCrypt \
<https://github.com/libtom/libtomcrypt> library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CryptX"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIK/CryptX-0.076.tar.gz"

SRC_URI[md5sum] = "8e59e8f2dc6ff91fc151a078277a9f00"
SRC_URI[sha256sum] = "bb84ac012438c7cecdb51a5a6fffb4f1fee3b0eae0022e96cebc2e167522621c"

S = "${WORKDIR}/CryptX-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
