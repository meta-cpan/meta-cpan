DESCRIPTION = "This module provides the following functions:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Regexp-Util"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Regexp-Util-0.003.tar.gz"

SRC_URI[md5sum] = "4bfca803c1c61faa76e6d78e08e8c615"
SRC_URI[sha256sum] = "aae41abb805bfd8a9af7963360bed6ef62c0e6ef6c36655cba565317df63c106"

S = "${WORKDIR}/Regexp-Util-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
