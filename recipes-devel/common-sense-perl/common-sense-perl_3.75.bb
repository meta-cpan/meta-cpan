DESCRIPTION = "   Ã¢Â€ÂœNothing is more fairly distributed than common sense: no one \
thinks he needs more of it than he already has.Ã¢Â€Â�"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/common-sense"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/common-sense-3.75.tar.gz"

SRC_URI[md5sum] = "0929c6b03455ca988a9b4219aca15292"
SRC_URI[sha256sum] = "a86a1c4ca4f3006d7479064425a09fa5b6689e57261fcb994fe67d061cba0e7e"

S = "${WORKDIR}/common-sense-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
