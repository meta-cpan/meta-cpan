DESCRIPTION = "Hash::Merge merges two arbitrarily deep hashes into a single hash. That \
is, at any level, it will add non-conflicting key-value pairs from one hash \
to the other, and follows a set of specific rules when there are key value \
conflicts (as outlined below). The hash is followed recursively, so that \
deeply nested hashes that are at the same level will be merged when the \
parent hashes are merged. Please note that self-referencing hashes, or \
recursive references, are not handled well by this method."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-Merge"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/Hash-Merge-0.200.tar.gz"

SRC_URI[md5sum] = "54b5743103fb3b3986a384b5424f21f4"
SRC_URI[sha256sum] = "47f9f03330b7595c94e73bdd17dc6682ba59d1cc89e63f4e319617f4bb122a64"
RDEPENDS_${PN} += "clone-perl"

S = "${WORKDIR}/Hash-Merge-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
