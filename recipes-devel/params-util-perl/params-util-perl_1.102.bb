DESCRIPTION = ""Params::Util" provides a basic set of importable functions that makes \
checking parameters a hell of a lot easier"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Util"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Params-Util-1.102.tar.gz"

SRC_URI[md5sum] = "f1aa70ba570f03f14cd394096b9c6883"
SRC_URI[sha256sum] = "499bb1b482db24fda277a51525596ad092c2bd51dd508fa8fec2e9f849097402"
DEPENDS += "test-leaktrace-perl-native"
RECOMMENDS += "config-autoconf-perl-native"

S = "${WORKDIR}/Params-Util-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
