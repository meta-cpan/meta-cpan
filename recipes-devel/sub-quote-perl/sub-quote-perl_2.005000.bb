DESCRIPTION = "This package provides performant ways to generate subroutines from strings."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Quote"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Sub-Quote-2.005000.tar.gz"

SRC_URI[md5sum] = "a6fbb9fa320b75c4914f91e331b19417"
SRC_URI[sha256sum] = "44b145111bee7b0001818e77f7ce587153232dbc97351f4c5ed34522372b64ff"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Sub-Quote-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
