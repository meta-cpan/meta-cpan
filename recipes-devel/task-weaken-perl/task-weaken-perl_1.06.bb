DESCRIPTION = "One recurring problem in modules that use Scalar::Util's "weaken" function \
is that it is not present in the pure-perl variant."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Task-Weaken"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Task-Weaken-1.06.tar.gz"

SRC_URI[md5sum] = "5645d2aceb2336b5d55a61388fee5966"
SRC_URI[sha256sum] = "2383fedb9dbaef646468ea824afbf7c801076720cfba0df2a7a074726dcd66be"

S = "${WORKDIR}/Task-Weaken-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
