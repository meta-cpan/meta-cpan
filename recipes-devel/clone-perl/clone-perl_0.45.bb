DESCRIPTION = "This module provides a "clone()" method which makes recursive copies of \
nested hash, array, scalar and reference types, including tied variables \
and objects."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Clone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-0.45.tar.gz"

SRC_URI[md5sum] = "b101333499b638658f89e29458cd83c0"
SRC_URI[sha256sum] = "cbb6ee348afa95432e4878893b46752549e70dc68fe6d9e430d1d2e99079a9e6"
RDEPENDS:${PN} += "b-cow-perl"
DEPENDS += "b-cow-perl-native"

S = "${WORKDIR}/Clone-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
