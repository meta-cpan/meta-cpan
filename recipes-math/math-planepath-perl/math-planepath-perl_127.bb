DESCRIPTION = "This is a base class for some mathematical paths which map an integer \
position $n to and from coordinates "$x,$y" in the 2D plane."

SECTION = "libs"
LICENSE = "GPLv3"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-PlanePath"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KR/KRYDE/Math-PlanePath-127.tar.gz"

SRC_URI[md5sum] = "44e06192c0049faeec0f5cbad9d29585"
SRC_URI[sha256sum] = "40f0c38007de46b4b1a7f27b6ae20e62ced98ff5c4a5bfd1c89ebfd8fce5feb7"
RDEPENDS_${PN} += "constant-defer-perl"
RDEPENDS_${PN} += "math-libm-perl"

S = "${WORKDIR}/Math-PlanePath-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
