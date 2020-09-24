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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-Terminal-0.04.tar.gz"

SRC_URI[md5sum] = "d060e45c87217750e481a5d1b0c8e10c"
SRC_URI[sha256sum] = "190f49da626becd4cb91ae1e88b52c3d18213e16b795e6df57bb23f87000b337"
RDEPENDS_${PN} += "convert-color-perl"
RDEPENDS_${PN} += "convert-color-xterm-perl"
RDEPENDS_${PN} += "string-tagged-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/String-Tagged-Terminal-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
