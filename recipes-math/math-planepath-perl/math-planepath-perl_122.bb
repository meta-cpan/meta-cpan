DESCRIPTION = "This is a base class for some mathematical paths which map an integer \
position $n to and from coordinates "$x,$y" in the 2D plane."

SECTION = "libs"
LICENSE = "GPLv3"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-PlanePath"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KR/KRYDE/Math-PlanePath-122.tar.gz"

SRC_URI[md5sum] = "c0d198e1f8f753ffee63226b33e05056"
SRC_URI[sha256sum] = "edcf64f5cb9e4cca6dd6ee88c285551ee5151438c041cdeb41a4af88f184452f"
RDEPENDS_${PN} += "constant-defer-perl"
RDEPENDS_${PN} += "math-libm-perl"

S = "${WORKDIR}/Math-PlanePath-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
