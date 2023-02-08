DESCRIPTION = "This subclass of String::Tagged provides a method, "build_terminal", for \
outputting the formatting tags embedded in the string as terminal escape \
sequences, to render the the output in the appropriate style."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Tagged-Terminal"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-Terminal-0.05.tar.gz"

SRC_URI[md5sum] = "c7dbad9df5394c2f456b59e7fb6de2ac"
SRC_URI[sha256sum] = "b41e086689872ce0de32f72f1858575d6e5e2d4ba87ba22588688488f2c0b758"
RDEPENDS:${PN} += "convert-color-perl"
RDEPENDS:${PN} += "convert-color-xterm-perl"
RDEPENDS:${PN} += "string-tagged-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/String-Tagged-Terminal-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
