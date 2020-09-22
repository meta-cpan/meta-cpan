DESCRIPTION = "The "Time::HiRes" module implements a Perl interface to the "usleep", \
"nanosleep", "ualarm", "gettimeofday", and "setitimer"/"getitimer" system \
calls, in other words, high resolution time and timers. See the "EXAMPLES" \
section below and the test scripts for usage; see your system documentation \
for the description of the underlying "nanosleep" or "usleep", "ualarm", \
"gettimeofday", and "setitimer"/"getitimer" calls."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Time-HiRes"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Time-HiRes-1.9764.tar.gz"

SRC_URI[md5sum] = "933103b1f4febedd974cdfaefb140bf3"
SRC_URI[sha256sum] = "9841be5587bfb7cd1f2fe267b5e5ac04ce25e79d5cc77e5ef9a9c5abd101d7b1"

S = "${WORKDIR}/Time-HiRes-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
