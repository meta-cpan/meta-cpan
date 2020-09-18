DESCRIPTION = "I've been writing the equivalent of this module at the top of my code for \
about a year now. I figured it was time to make it shorter."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/strictures"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/strictures-2.000006.tar.gz"

SRC_URI[md5sum] = "35c14fd25320f32ff40e977feae95d0d"
SRC_URI[sha256sum] = "09d57974a6d1b2380c802870fed471108f51170da81458e2751859f2714f8d57"
RRECOMMENDS_${PN} += "bareword-filehandles-perl"
RRECOMMENDS_${PN} += "indirect-perl"
RRECOMMENDS_${PN} += "multidimensional-perl"

S = "${WORKDIR}/strictures-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
