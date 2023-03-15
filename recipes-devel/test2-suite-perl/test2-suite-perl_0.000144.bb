DESCRIPTION = "Rich set of tools, plugins, bundles, etc built upon the Test2 testing \
library. If you are interested in writing tests, this is the distribution \
for you."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test2-Suite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test2-Suite-0.000144.tar.gz"

SRC_URI[md5sum] = "6a0f7a5e5e7d0ca2544cc8f5db3c8692"
SRC_URI[sha256sum] = "90c03c4445bf5657d6befeb29228ee2b7ee2ca3f915cd10a856436c6daeb8e01"
RDEPENDS:${PN} += "importer-perl"
RDEPENDS:${PN} += "module-pluggable-perl"
RDEPENDS:${PN} += "scope-guard-perl"
RDEPENDS:${PN} += "sub-info-perl"
RDEPENDS:${PN} += "term-table-perl"
RDEPENDS:${PN} += "test-simple-perl"

S = "${WORKDIR}/Test2-Suite-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
