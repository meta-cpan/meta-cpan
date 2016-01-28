DESCRIPTION = "Verifies code hasn't left circular references"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Memory-Cycle"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PETDANCE/Test-Memory-Cycle-1.06.tar.gz"

SRC_URI[md5sum] = "397e709ba33d3883b5fb2bc49e3a70b0"
SRC_URI[sha256sum] = "9d53ddfdc964cd8454cb0da4c695b6a3ae47b45839291c34cb9d8d1cfaab3202"
RDEPENDS_${PN} += "devel-cycle-perl"
RDEPENDS_${PN} += "padwalker-perl"

S = "${WORKDIR}/Test-Memory-Cycle-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
