DESCRIPTION = "I've been writing the equivalent of this module at the top of my code for \
about a year now. I figured it was time to make it shorter."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/strictures"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/strictures-2.000005.tar.gz"

SRC_URI[md5sum] = "30e19bf51cf27df447ac7f2702750f02"
SRC_URI[sha256sum] = "960bdb9f82c8f09caebc417bce3fdf75b27de81f4408d0ba0b0a6d61ab86dd99"
RRECOMMENDS_${PN} += "bareword-filehandles-perl"
RRECOMMENDS_${PN} += "indirect-perl"
RRECOMMENDS_${PN} += "multidimensional-perl"

S = "${WORKDIR}/strictures-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
