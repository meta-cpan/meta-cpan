DESCRIPTION = ""RRDTool::OO\" is an object-oriented interface to Tobi Oetiker's round \
robin database tool *rrdtool*. It uses *rrdtool*'s \"RRDs\" module to \
get access to *rrdtool*'s shared library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/RRDTool-OO"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/RRDTool-OO-0.36.tar.gz"

SRC_URI[md5sum] = "a29680794184537d60fcf8de7b6a9ffc"
SRC_URI[sha256sum] = "4810c245926c33ea9da75ae4443981d96036fdea7ee6c735f8e1ef4b0addfbd5"
DEPENDS += "rrdtool-native"
RDEPENDS:${PN} += "rrdtool-perl"
RDEPENDS:${PN} += "log-log4perl-perl"

S = "${WORKDIR}/RRDTool-OO-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
