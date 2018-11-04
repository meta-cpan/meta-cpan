DESCRIPTION = "This module is optionally used by Type::Tiny 0.045_03 and above to provide \
faster, C-based implementations of some type constraints. (This package has \
only core dependencies, and does not depend on Type::Tiny, so other data \
validation frameworks might also consider using it!)"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-XS-0.014.tar.gz"

SRC_URI[md5sum] = "e6f54521cfbaf741aabd9326bee4174f"
SRC_URI[sha256sum] = "828bde64f3c31e1df541ffa0af91fe91e441c9f749e3d465f8a9562e1a7c7bad"

S = "${WORKDIR}/Type-Tiny-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
