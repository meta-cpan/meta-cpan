DESCRIPTION = "Number::Tolerant creates a number-like object whose value refers to a range \
of possible values, each equally acceptable. It overloads comparison \
operations to reflect this."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Number-Tolerant"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Number-Tolerant-1.708.tar.gz"

SRC_URI[md5sum] = "98d8c97259c4fb14e80593a42dc661a5"
SRC_URI[sha256sum] = "c0463b04eb49173dec94821e1066ac1517ba1bab71c7c32d3a3d93f736618d43"
RDEPENDS_${PN} += "sub-exporter-perl"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Number-Tolerant-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
