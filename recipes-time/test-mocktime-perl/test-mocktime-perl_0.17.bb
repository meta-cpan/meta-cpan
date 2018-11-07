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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DD/DDICK/Test-MockTime-0.17.tar.gz"

SRC_URI[md5sum] = "3cd809ebccc72b0701afbba51029ac56"
SRC_URI[sha256sum] = "3363e118b2606f1d6abc956f22b0d09109772b7086155fb5c9c7f983350602f9"

S = "${WORKDIR}/Test-MockTime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
