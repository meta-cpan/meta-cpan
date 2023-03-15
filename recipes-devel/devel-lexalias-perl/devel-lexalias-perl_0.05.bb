DESCRIPTION = "Devel::LexAlias provides the ability to alias a lexical variable in a \
subroutines scope to one of your choosing."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-LexAlias"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Devel-LexAlias-0.05.tar.gz"

SRC_URI[md5sum] = "1a4f70dff1a47b3eb96bdeac50db2ec5"
SRC_URI[sha256sum] = "5e0ad9d43e266033856e424e104a0009f8e63449e40cd5aba59ad94cb1bcee72"
RDEPENDS:${PN} += "devel-caller-perl"

S = "${WORKDIR}/Devel-LexAlias-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
