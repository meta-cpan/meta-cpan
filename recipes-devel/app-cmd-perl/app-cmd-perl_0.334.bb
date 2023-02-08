DESCRIPTION = "App::Cmd is intended to make it easy to write complex command-line \
applications without having to think about most of the annoying things \
usually involved."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/App-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/App-Cmd-0.334.tar.gz"

SRC_URI[md5sum] = "2b9e648adae3cf7f122e824a06042197"
SRC_URI[sha256sum] = "22e31e0f8f7b8c4303ad62b0ab1f941fcf598ca6e3a146b7e482e5870d6d58d3"
RDEPENDS:${PN} += "capture-tiny-perl"
RDEPENDS:${PN} += "class-load-perl"
RDEPENDS:${PN} += "data-optlist-perl"
RDEPENDS:${PN} += "getopt-long-descriptive-perl"
RDEPENDS:${PN} += "io-tiecombine-perl"
RDEPENDS:${PN} += "module-pluggable-perl"
RDEPENDS:${PN} += "string-rewriteprefix-perl"
RDEPENDS:${PN} += "sub-exporter-perl"
RDEPENDS:${PN} += "sub-install-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/App-Cmd-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
