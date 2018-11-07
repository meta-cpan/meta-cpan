DESCRIPTION = "This subclass of String::Tagged provides a method, "build_terminal", for \
outputting the formatting tags embedded in the string as terminal escape \
sequences, to render the the output in the appropriate style."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Tagged-Terminal"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-Terminal-0.03.tar.gz"

SRC_URI[md5sum] = "12acf5e3bd97eb7a97373800c8d97a76"
SRC_URI[sha256sum] = "9a714348fa9533e104d8f0226a39e9daf2d44c09823dda6119353c4fe0f38f30"
RDEPENDS_${PN} += "convert-color-perl"
RDEPENDS_${PN} += "convert-color-xterm-perl"
RDEPENDS_${PN} += "string-tagged-perl"

S = "${WORKDIR}/String-Tagged-Terminal-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
