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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-1.50.tar.gz"

SRC_URI[md5sum] = "136313884d1afa2fb6840695a1034b2c"
SRC_URI[sha256sum] = "06aab9c693380190e53be09be7daed20c5d6278f71956989c24cca7782013675"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
