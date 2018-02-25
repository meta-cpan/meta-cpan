DESCRIPTION = "App::Cmd is intended to make it easy to write complex command-line \
applications without having to think about most of the annoying things \
usually involved."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/App-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/App-Cmd-0.331.tar.gz"

SRC_URI[md5sum] = "b43c07d7b4d4e2a6baf32aa92cd00b93"
SRC_URI[sha256sum] = "4a5d3df0006bd278880d01f4957aaa652a8f91fe8f66e93adf70fba0c3ecb680"
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
