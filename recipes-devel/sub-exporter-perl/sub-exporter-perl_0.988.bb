DESCRIPTION = "ACHTUNG! If you're not familiar with Exporter or exporting, read \
Sub::Exporter::Tutorial first!"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Exporter"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Sub-Exporter-0.988.tar.gz"

SRC_URI[md5sum] = "9ccc63fd0f1d77e3e1a24bec07e05638"
SRC_URI[sha256sum] = "23324887d6c590f145702f077d8ca42f1b2f26a3b76f08d66c2c1e21e606040c"
RDEPENDS:${PN} += "data-optlist-perl"
RDEPENDS:${PN} += "params-util-perl"
RDEPENDS:${PN} += "sub-install-perl"

S = "${WORKDIR}/Sub-Exporter-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
