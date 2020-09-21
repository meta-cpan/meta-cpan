DESCRIPTION = "There's a whole bunch of class builders out there. But \
Object::Tiny is 93% smaller than Class::Accessor::Fast and Object::Tiny \
is 75% more terse to use than Class::Accessor::Fast and it requires no \
ugly constructor methods."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Object-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Object-Tiny-1.09.tar.gz"

SRC_URI[md5sum] = "80b27117b78276f468b390fe19eb5f4d"
SRC_URI[sha256sum] = "7819ccdd18ee18b0e5ce660c084e4e04be3f2f34341302925581d21b53cac6bd"

S = "${WORKDIR}/Object-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
