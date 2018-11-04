DESCRIPTION = "This package provides performant ways to generate subroutines from strings."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Quote"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Sub-Quote-2.005001.tar.gz"

SRC_URI[md5sum] = "1b0f288ca8c60243f9bc29cfee4c4986"
SRC_URI[sha256sum] = "d6ab4f0775def015367a05e02024b403f991b2be11d774f3d235fe7e9bdbba07"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Sub-Quote-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
