DESCRIPTION = "This is a base class for some mathematical paths which map an integer \
position $n to and from coordinates "$x,$y" in the 2D plane."

SECTION = "libs"
LICENSE = "GPLv3"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-PlanePath"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KR/KRYDE/Math-PlanePath-126.tar.gz"

SRC_URI[md5sum] = "9fba1b4e2d2e37053f1cdf6dca31965c"
SRC_URI[sha256sum] = "187ec3a80ebf2ff7e6009ebc7b1e141733ef23a32f6ca395ba22a5f7d2c98f04"
RDEPENDS_${PN} += "constant-defer-perl"
RDEPENDS_${PN} += "math-libm-perl"

S = "${WORKDIR}/Math-PlanePath-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
