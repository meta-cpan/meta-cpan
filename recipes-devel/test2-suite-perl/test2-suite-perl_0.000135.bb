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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test2-Suite-0.000135.tar.gz"

SRC_URI[md5sum] = "52bfe966e342209095780684ac5eb41a"
SRC_URI[sha256sum] = "1d0ac9e1e363c70ffecfe155e2cf917c610c671f65aa1cdb2425a3a6caeae21b"
RDEPENDS_${PN} += "importer-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "scope-guard-perl"
RDEPENDS_${PN} += "sub-info-perl"
RDEPENDS_${PN} += "term-table-perl"
RDEPENDS_${PN} += "test-simple-perl"

S = "${WORKDIR}/Test2-Suite-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
