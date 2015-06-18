DESCRIPTION = "Shared core for D1 and D2 Database plugins"

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer-Plugin-Database-Core"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/Dancer-Plugin-Database-Core-0.11.tar.gz"

SRC_URI[md5sum] = "5d66ac28e7f36fa60f01efa9b3826ca1"
SRC_URI[sha256sum] = "511e99b7501eacb082334e8ba5a5f9152af6d14bd4947eef6c872e27b65eaf20"
RDEPENDS_${PN} += "dbi-perl"

S = "${WORKDIR}/Dancer-Plugin-Database-Core-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
