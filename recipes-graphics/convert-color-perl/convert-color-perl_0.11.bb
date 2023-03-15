DESCRIPTION = "This module provides conversions between commonly used ways to express \
colors. It provides conversions between color spaces such as RGB and HSV, \
and it provides ways to look up colors by a name."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Convert-Color"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Convert-Color-0.11.tar.gz"

SRC_URI[md5sum] = "5d4ec8b804100dca53c6c406f2a83f4c"
SRC_URI[sha256sum] = "b41217c72931034ba4417d7a9e1e2999f04580d4e6b31c70993fedccc2440d38"
RDEPENDS:${PN} += "list-utilsby-perl"
RDEPENDS:${PN} += "module-pluggable-perl"
DEPENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/Convert-Color-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
