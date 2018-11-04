DESCRIPTION = "Similar to List::MoreUtils, "Hash::MoreUtils" contains trivial but \
commonly-used functionality for hashes. The primary focus for the moment is \
providing a common API - speeding up by XS is far away at the moment."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Hash-MoreUtils-0.06.tar.gz"

SRC_URI[md5sum] = "525f11766a1b548bcc07c4030b3b09fd"
SRC_URI[sha256sum] = "db9a8fb867d50753c380889a5e54075651b5e08c9b3b721cb7220c0883547de8"

S = "${WORKDIR}/Hash-MoreUtils-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
