DESCRIPTION = "I've been writing the equivalent of this module at the top of my code for \
about a year now. I figured it was time to make it shorter."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/strictures"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/strictures-2.000006.tar.gz"

SRC_URI[md5sum] = "35c14fd25320f32ff40e977feae95d0d"
SRC_URI[sha256sum] = "09d57974a6d1b2380c802870fed471108f51170da81458e2751859f2714f8d57"
RRECOMMENDS:${PN} += "bareword-filehandles-perl"
RRECOMMENDS:${PN} += "indirect-perl"
RRECOMMENDS:${PN} += "multidimensional-perl"

S = "${WORKDIR}/strictures-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
