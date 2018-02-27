DESCRIPTION = "One recurring problem in modules that use Scalar::Util's "weaken" function \
is that it is not present in the pure-perl variant."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Task-Weaken"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Task-Weaken-1.05.tar.gz"

SRC_URI[md5sum] = "4c66b1ac45257ac7fd670920daebf868"
SRC_URI[sha256sum] = "85f3bf738d0e94f935d9efd83575a2afd0aafb66adcc6624cee5064146f6b95c"

S = "${WORKDIR}/Task-Weaken-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
