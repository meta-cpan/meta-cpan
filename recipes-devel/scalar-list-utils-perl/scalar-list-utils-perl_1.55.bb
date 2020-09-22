DESCRIPTION = ""List::Util" contains a selection of subroutines that people have expressed \
would be nice to have in the perl core, but the usage would not really be \
high enough to warrant the use of a keyword, and the size so small such \
that being individual extensions would be wasteful."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scalar-List-Utils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-1.55.tar.gz"

SRC_URI[md5sum] = "7988f5111e33ba47e175cf3e86b0d93f"
SRC_URI[sha256sum] = "4d2bdc1c72a7bc4d69d6a5cc85bc7566497c3b183c6175b832784329d58feb4b"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
