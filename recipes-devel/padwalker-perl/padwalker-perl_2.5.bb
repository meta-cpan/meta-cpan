DESCRIPTION = "PadWalker is a module which allows you to inspect (and even change!) \
lexical variables in any subroutine which called you. It will only show \
those variables which are in scope at the point of the call."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/PadWalker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RO/ROBIN/PadWalker-2.5.tar.gz"

SRC_URI[md5sum] = "f3f1e06c0385aab80353176a414f02b2"
SRC_URI[sha256sum] = "07b26abb841146af32072a8d68cb90176ffb176fd9268e6f2f7d106f817a0cd0"

S = "${WORKDIR}/PadWalker-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
