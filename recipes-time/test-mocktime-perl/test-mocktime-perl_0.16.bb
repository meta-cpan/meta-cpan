DESCRIPTION = "This module was created to enable test suites to test code at specific \
points in time. Specifically it overrides localtime, gmtime and time at \
compile time and then relies on the user supplying a mock time via \
set_relative_time, set_absolute_time or set_fixed_time to alter future \
calls to gmtime,time or localtime."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-MockTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DD/DDICK/Test-MockTime-0.16.tar.gz"

SRC_URI[md5sum] = "624d6976d57a79c9cd14237168424f44"
SRC_URI[sha256sum] = "087493cf235432aa2320ebde468cb81d36f5416be083a7d046351c2b8f3fbbef"

S = "${WORKDIR}/Test-MockTime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
