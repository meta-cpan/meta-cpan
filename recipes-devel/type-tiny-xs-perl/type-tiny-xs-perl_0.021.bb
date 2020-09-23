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

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-XS-0.021.tar.gz"

SRC_URI[md5sum] = "28d17ede97972a033d8954b70f82a6f9"
SRC_URI[sha256sum] = "f7a9e216d1496744def402aa326620e13e73ad1ee7109cfbaeaac363d8eaf5df"

S = "${WORKDIR}/Type-Tiny-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
