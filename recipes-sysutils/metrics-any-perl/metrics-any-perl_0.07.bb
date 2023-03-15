DESCRIPTION = "Provides a central location for modules to report monitoring metrics, such \
as counters of the number of times interesting events have happened, and \
programs to collect up and send those metrics to monitoring services."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Metrics-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Metrics-Any-0.07.tar.gz"

SRC_URI[md5sum] = "99ab22e40b7a9b13cf371521e93ed45d"
SRC_URI[sha256sum] = "537ff8c75ddae3accd0be26bd5da01712c4db72d81a6617d934b162e75f63b42"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Metrics-Any-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
