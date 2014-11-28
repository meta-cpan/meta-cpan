DESCRIPTION = "A \"Devel::MAT\" instance loads a heapdump file, and provides a \
container to store analysis tools to work on it. Tools may be provided \
that conform to the Devel::MAT::Tool API, which can help analyse the data \
and interact with the explorer user interface by using the methods in the \
Devel::MAT::UI package."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-MAT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-0.19.tar.gz"

SRC_URI[md5sum] = "4200b95ea2489acb73c33704c4a4f018"
SRC_URI[sha256sum] = "6d6bd9aacc996a2a391d01a25a8f15b3ee5f8d59ef9c01f03e7b37ffe00b187b"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "list-utilsby-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "scalar-list-utils-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/Devel-MAT-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
