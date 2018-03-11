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

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JH/JHI/Time-HiRes-1.9753.tar.gz"

SRC_URI[md5sum] = "b98099e0cb7702210606776e9746e103"
SRC_URI[sha256sum] = "0fbfd5f99cdd26011d5c0bc3a8e369dacc4a9e1d1658f4663ac6018f2cec4915"

S = "${WORKDIR}/Time-HiRes-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
