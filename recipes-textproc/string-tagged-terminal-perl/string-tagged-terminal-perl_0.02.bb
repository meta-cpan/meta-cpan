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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-Terminal-0.02.tar.gz"

SRC_URI[md5sum] = "3cead89c0da18083a84e9f1e7f10ea21"
SRC_URI[sha256sum] = "64d8898876dadc34f1c1bba8738a2202106f3cce94ea6269a3a5cc87be114468"
RDEPENDS_${PN} += "convert-color-perl"
RDEPENDS_${PN} += "convert-color-xterm-perl"

S = "${WORKDIR}/String-Tagged-Terminal-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
