DESCRIPTION = "Shared core for D1 and D2 Database plugins"

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer-Plugin-Database-Core"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BIGPRESH/Dancer-Plugin-Database-Core-0.20.tar.gz"

SRC_URI[md5sum] = "05c72a7567bd5f63cd84980c20d55416"
SRC_URI[sha256sum] = "345536603883e2fcc599ef79ead66d97a8ec0c2e31e24f60a55298e8d498150a"
RDEPENDS_${PN} += "dbi-perl"

S = "${WORKDIR}/Dancer-Plugin-Database-Core-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
