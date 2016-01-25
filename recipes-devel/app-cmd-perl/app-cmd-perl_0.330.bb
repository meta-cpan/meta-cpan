DESCRIPTION = "App::Cmd is intended to make it easy to write complex command-line \
applications without having to think about most of the annoying things \
usually involved."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/App-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/App-Cmd-0.330.tar.gz"

SRC_URI[md5sum] = "dde7b65165abeb4613643007583cb03f"
SRC_URI[sha256sum] = "7a7bfd7196f7551a07509b03ea7abddc1fa9aee19a84e3dd5ba939c619cb6011"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "getopt-long-descriptive-perl"
RDEPENDS_${PN} += "io-tiecombine-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "string-rewriteprefix-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
RDEPENDS_${PN} += "sub-install-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/App-Cmd-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
