DESCRIPTION = "Shared core for D1 and D2 Database plugins"

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer-Plugin-Database-Core"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/Dancer-Plugin-Database-Core-0.14.tar.gz"

SRC_URI[md5sum] = "b08f8d78c608a5de1d67741c8e923cab"
SRC_URI[sha256sum] = "9f4d6a651d23f9f1f0915c5dcfccf03120fa8495807e56b2c38edba8a5beb461"
RDEPENDS_${PN} += "dbi-perl"

S = "${WORKDIR}/Dancer-Plugin-Database-Core-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
