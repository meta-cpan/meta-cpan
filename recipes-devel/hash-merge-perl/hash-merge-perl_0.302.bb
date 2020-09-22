DESCRIPTION = "Hash::Merge merges two arbitrarily deep hashes into a single hash. That is, \
at any level, it will add non-conflicting key-value pairs from one hash to \
the other, and follows a set of specific rules when there are key value \
conflicts (as outlined below). The hash is followed recursively, so that \
deeply nested hashes that are at the same level will be merged when the \
parent hashes are merged. Please note that self-referencing hashes, or \
recursive references, are not handled well by this method."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-Merge"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HE/HERMES/Hash-Merge-0.302.tar.gz"

SRC_URI[md5sum] = "6f65d0a4ca2a7bd42975c8869dcc24da"
SRC_URI[sha256sum] = "ae0522f76539608b61dde14670e79677e0f391036832f70a21f31adde2538644"
RDEPENDS_${PN} += "clone-choose-perl"

S = "${WORKDIR}/Hash-Merge-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
