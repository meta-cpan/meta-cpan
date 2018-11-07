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

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JH/JHI/Time-HiRes-1.9758.tar.gz"

SRC_URI[md5sum] = "8f998cb60966c86e24c500016e4d1ce8"
SRC_URI[sha256sum] = "5bfa145bc11e70a8e337543b1084a293743a690691b568493455dedf58f34b1e"

S = "${WORKDIR}/Time-HiRes-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
