DESCRIPTION = "This module acts as a layer between Exporter and modules which consume \
exports. It is feature-compatible with Exporter, plus some much needed \
extras. You can use this to import symbols from any exporter that follows \
Exporters specification. The exporter modules themselves do not need to use \
or inherit from the Exporter module, they just need to set @EXPORT and/or \
other variables."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Importer"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Importer-0.026.tar.gz"

SRC_URI[md5sum] = "3f09930b82cadfe26d0ce2fb1338aa1b"
SRC_URI[sha256sum] = "e08fa84e13cb998b7a897fc8ec9c3459fcc1716aff25cc343e36ef875891b0ef"

S = "${WORKDIR}/Importer-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
