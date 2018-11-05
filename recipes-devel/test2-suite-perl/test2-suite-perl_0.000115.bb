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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test2-Suite-0.000115.tar.gz"

SRC_URI[md5sum] = "eca653c9eda1c4c5ad30b256556bd2ef"
SRC_URI[sha256sum] = "02be3428a0965aeb21245d44bbadda69b94dc76cd68d5695352c996ac7fc3638"
RDEPENDS_${PN} += "importer-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "scope-guard-perl"
RDEPENDS_${PN} += "sub-info-perl"
RDEPENDS_${PN} += "term-table-perl"
RDEPENDS_${PN} += "test-simple-perl"

S = "${WORKDIR}/Test2-Suite-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
