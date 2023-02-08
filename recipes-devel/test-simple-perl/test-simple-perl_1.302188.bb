DESCRIPTION = "** If you are unfamiliar with testing read Test::Tutorial first! **"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.302188.tar.gz"

SRC_URI[md5sum] = "7d85adce7995c3b390c1d0685057b407"
SRC_URI[sha256sum] = "0b7a0e304ca24d657d79b73c9ff3f381dc460f356e4044de326ed03ddab16c95"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
