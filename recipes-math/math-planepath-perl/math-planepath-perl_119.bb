DESCRIPTION = "This is a base class for some mathematical paths which map an integer \
position $n to and from coordinates \"$x,$y\" in the 2D plane."

SECTION = "libs"
LICENSE = "GPL-3.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-PlanePath"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KR/KRYDE/Math-PlanePath-119.tar.gz"

SRC_URI[md5sum] = "9f801c33fe099b943f46ceccbc5fab40"
SRC_URI[sha256sum] = "40f926a50cf6e22c0fb5b3d26e345b83adfc1d1a826252d8bd20d75274c08744"
RDEPENDS_${PN} += "constant-defer-perl"
RDEPENDS_${PN} += "math-libm-perl"

S = "${WORKDIR}/Math-PlanePath-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
