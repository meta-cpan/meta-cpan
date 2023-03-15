DESCRIPTION = ""Clone::Choose" checks several different modules which provides a "clone()" \
function and selects an appropriate one. The default preference is"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Clone-Choose"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HE/HERMES/Clone-Choose-0.010.tar.gz"

SRC_URI[md5sum] = "420920f99c01308bcdfb6a731082f04f"
SRC_URI[sha256sum] = "5623481f58cee8edb96cd202aad0df5622d427e5f748b253851dfd62e5123632"
RRECOMMENDS:${PN} += "clone-perl"
RRECOMMENDS:${PN} += "module-runtime-perl"
DEPENDS += "test-without-module-perl-native"

S = "${WORKDIR}/Clone-Choose-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
