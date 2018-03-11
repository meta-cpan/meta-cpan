DESCRIPTION = "Rich set of tools, plugins, bundles, etc built upon the Test2 testing \
library. If you are interested in writing tests, this is the distribution \
for you."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test2-Suite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test2-Suite-0.000106.tar.gz"

SRC_URI[md5sum] = "ca3711353323de95166d1e5ef6d92428"
SRC_URI[sha256sum] = "2ce6a850252d6903f71d2c2ac16aa45ef9d2972ee76666027c3a28708414dedd"
RDEPENDS_${PN} += "importer-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "scope-guard-perl"
RDEPENDS_${PN} += "sub-info-perl"
RDEPENDS_${PN} += "term-table-perl"
RDEPENDS_${PN} += "test-simple-perl"

S = "${WORKDIR}/Test2-Suite-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
