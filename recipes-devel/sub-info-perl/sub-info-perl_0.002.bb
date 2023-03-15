DESCRIPTION = "Tool to inspect subroutines."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Info"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Sub-Info-0.002.tar.gz"

SRC_URI[md5sum] = "335345b534fc0539c894050f7814cbda"
SRC_URI[sha256sum] = "ea3056d696bdeff21a99d340d5570887d39a8cc47bff23adfc82df6758cdd0ea"
RDEPENDS:${PN} += "importer-perl"

S = "${WORKDIR}/Sub-Info-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
