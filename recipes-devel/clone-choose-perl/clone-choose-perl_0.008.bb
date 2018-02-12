DESCRIPTION = ""Clone::Choose" checks several different modules which provides a "clone()" \
function and selects an appropriate one. The default preference is"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Clone-Choose"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HE/HERMES/Clone-Choose-0.008.tar.gz"

SRC_URI[md5sum] = "4a16eb5694c6cffcae68d9ea6275fafd"
SRC_URI[sha256sum] = "d32ac724c006250c966592579a97ff0734feac7c51a983d554f8371ade022e3f"
RRECOMMENDS_${PN} += "module-runtime-perl"
RRECOMMENDS_${PN} += "clone-perl"

S = "${WORKDIR}/Clone-Choose-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
