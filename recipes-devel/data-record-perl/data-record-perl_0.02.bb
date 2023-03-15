DESCRIPTION = "Sometimes we need data split into records and a simple split on the input \
record separator ($/) or some other value fails because the values we're \
splitting on may allowed in other parts of the data. Perhaps they're \
quoted. Perhaps they're embedded in other data which should not be split \
up."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Record"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OV/OVID/Data-Record-0.02.tar.gz"

SRC_URI[md5sum] = "1c22555d2ef4494d5991a12bb44a0e20"
SRC_URI[sha256sum] = "1d6ae66da2767520c21fbf12c538f1007ab27445d92c8eac763653f2b8849ebf"
RDEPENDS:${PN} += "sub-uplevel-perl"
DEPENDS += "test-exception-perl-native"

S = "${WORKDIR}/Data-Record-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
