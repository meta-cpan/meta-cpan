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

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HE/HERMES/Hash-Merge-0.299.tar.gz"

SRC_URI[md5sum] = "e186887f0296117fd27430efc1172285"
SRC_URI[sha256sum] = "a641989276d94124e54bc696c3b4da5d4c2fb6a8bc60c159ee84a310d2bf38e7"
RDEPENDS_${PN} += "clone-choose-perl"

S = "${WORKDIR}/Hash-Merge-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
