DESCRIPTION = "This module is optionally used by Type::Tiny 0.045_03 and above to provide \
faster, C-based implementations of some type constraints. (This package has \
only core dependencies, and does not depend on Type::Tiny, so other data \
validation frameworks might also consider using it!)"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-XS-0.022.tar.gz"

SRC_URI[md5sum] = "90cf4f630e6526da9206e9ad12602022"
SRC_URI[sha256sum] = "bcc34a31f7dc1d30cc803889b5c8f90e4773b73b5becbdb3860f5abe7e22ff00"

S = "${WORKDIR}/Type-Tiny-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
