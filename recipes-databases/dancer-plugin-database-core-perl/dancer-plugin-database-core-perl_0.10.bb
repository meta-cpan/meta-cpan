DESCRIPTION = "Shared core for D1 and D2 Database plugins"

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer-Plugin-Database-Core"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/Dancer-Plugin-Database-Core-0.10.tar.gz"

SRC_URI[md5sum] = "2b7c8b012f45b38d6c9d736df9425fbe"
SRC_URI[sha256sum] = "7a1753a44765d149900755e18324328c6b43aa49fa9ff61524a3805ebffa8c15"
RDEPENDS_${PN} += "dbi-perl"

S = "${WORKDIR}/Dancer-Plugin-Database-Core-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
