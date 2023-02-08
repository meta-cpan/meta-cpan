DESCRIPTION = ""List::Util" contains a selection of subroutines that people have expressed \
would be nice to have in the perl core, but the usage would not really be \
high enough to warrant the use of a keyword, and the size so small such \
that being individual extensions would be wasteful."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scalar-List-Utils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-1.60.tar.gz"

SRC_URI[md5sum] = "2e9e72dab0a3171be207117b70bb9e58"
SRC_URI[sha256sum] = "c685bad8021f008f321288b7c3182ec724ab198a77610e877c86f3fad4b85f07"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
