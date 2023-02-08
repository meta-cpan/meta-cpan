DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/experimental"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/experimental-0.025.tar.gz"

SRC_URI[md5sum] = "e0c74e5c2bc651158e349effcaf89f0e"
SRC_URI[sha256sum] = "d886deeadd2bea6ed2a0d9c127d9a36da817a4e4d5a6ecd04a6b12b234d0664e"

S = "${WORKDIR}/experimental-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
