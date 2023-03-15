DESCRIPTION = "This is a base class for some mathematical paths which map an integer \
position $n to and from coordinates "$x,$y" in the 2D plane."

SECTION = "libs"
LICENSE = "GPL-3.0-only"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-PlanePath"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KR/KRYDE/Math-PlanePath-129.tar.gz"

SRC_URI[md5sum] = "3e716fee3374a887983dffdf19bba230"
SRC_URI[sha256sum] = "8da15d0e4d5077b6c5d203765b2885bf728e509e32de9264605c0862137e397e"
RDEPENDS:${PN} += "constant-defer-perl"
RDEPENDS:${PN} += "math-libm-perl"

S = "${WORKDIR}/Math-PlanePath-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
