DESCRIPTION = "Format and parse DateTime::Durations"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Format-Duration"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/DateTime-Format-Duration-1.04.tar.gz"

SRC_URI[md5sum] = "34298bc24aee006aaae862809e0e8224"
SRC_URI[sha256sum] = "c86b8095de3fe36dc53edda8b146318420a4425572863f8704e8529fc8ff6492"
RDEPENDS:${PN} += "datetime-perl"
RDEPENDS:${PN} += "params-validate-perl"

S = "${WORKDIR}/DateTime-Format-Duration-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
