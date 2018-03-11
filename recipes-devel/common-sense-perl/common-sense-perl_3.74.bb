DESCRIPTION = "   “Nothing is more fairly distributed than common sense: no one thinks \
he needs more of it than he already has.”"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/common-sense"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/common-sense-3.74.tar.gz"

SRC_URI[md5sum] = "35b273147200c4c95eef7816f83e572d"
SRC_URI[sha256sum] = "771f7d02abd1ded94d9e37d3f66e795c8d2026d04defbeb5b679ca058116bbf3"

S = "${WORKDIR}/common-sense-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
