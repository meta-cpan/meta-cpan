DESCRIPTION = "B::COW provides some naive additional B helpers to check the COW status of \
one SvPV."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-COW"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/B-COW-0.004.tar.gz"

SRC_URI[md5sum] = "a1ef8623a06ce9f6358674d7e604de1e"
SRC_URI[sha256sum] = "fcafb775ed84a45bc2c06c5ffd71342cb3c06fb0bdcd5c1b51b0c12f8b585f51"

S = "${WORKDIR}/B-COW-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
