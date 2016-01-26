DESCRIPTION = "This module was created to enable test suites to test code at specific \
points in time. Specifically it overrides localtime, gmtime and time at \
compile time and then relies on the user supplying a mock time via \
set_relative_time, set_absolute_time or set_fixed_time to alter future \
calls \
to gmtime,time or localtime."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-MockTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DD/DDICK/Test-MockTime-0.15.tar.gz"

SRC_URI[md5sum] = "af7374d01a2d6a0a9a341543ab8619e1"
SRC_URI[sha256sum] = "88210201de97aab66cb100edc2be3368c0062a9de635f4f8ec258a2267edcc48"

S = "${WORKDIR}/Test-MockTime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
