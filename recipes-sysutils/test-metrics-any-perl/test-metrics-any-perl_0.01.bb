DESCRIPTION = "This test module helps write unit tests which assert that the code under \
test reports metrics via Metrics::Any."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Metrics-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Test-Metrics-Any-0.01.tar.gz"

SRC_URI[md5sum] = "832bbe4116c9805025d4b37723eb2c81"
SRC_URI[sha256sum] = "2506c88d4eb21b274b1085f806c918dcc97fff69e16d1249e6e19d943625e468"
RDEPENDS:${PN} += "metrics-any-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Test-Metrics-Any-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
