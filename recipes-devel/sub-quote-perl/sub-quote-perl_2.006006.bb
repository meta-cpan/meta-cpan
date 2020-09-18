DESCRIPTION = "This package provides performant ways to generate subroutines from strings."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Quote"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Sub-Quote-2.006006.tar.gz"

SRC_URI[md5sum] = "1bb9caee697bcfa738f419d40505e506"
SRC_URI[sha256sum] = "6e4e2af42388fa6d2609e0e82417de7cc6be47223f576592c656c73c7524d89d"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Sub-Quote-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
