DESCRIPTION = "There's a whole bunch of class builders out there. In fact, creating a \
class builder seems to be something of a rite of passage (this is my fifth, \
at least)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Object-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Object-Tiny-1.09.tar.gz"

SRC_URI[md5sum] = "80b27117b78276f468b390fe19eb5f4d"
SRC_URI[sha256sum] = "7819ccdd18ee18b0e5ce660c084e4e04be3f2f34341302925581d21b53cac6bd"

S = "${WORKDIR}/Object-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
