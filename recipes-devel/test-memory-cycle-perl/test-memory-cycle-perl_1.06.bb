DESCRIPTION = "Verifies code hasn't left circular references"

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Memory-Cycle"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PETDANCE/Test-Memory-Cycle-1.06.tar.gz"

SRC_URI[md5sum] = "397e709ba33d3883b5fb2bc49e3a70b0"
SRC_URI[sha256sum] = "9d53ddfdc964cd8454cb0da4c695b6a3ae47b45839291c34cb9d8d1cfaab3202"
RDEPENDS:${PN} += "devel-cycle-perl"
RDEPENDS:${PN} += "padwalker-perl"

S = "${WORKDIR}/Test-Memory-Cycle-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
