DESCRIPTION = "This class is the base class for all time zone objects. A time zone is \
represented internally as a set of observances, each of which describes the \
offset from GMT for a given time period."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-TimeZone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-TimeZone-1.95.tar.gz"

SRC_URI[md5sum] = "9abc657f20ae1cc77651f0fc69cbe36b"
SRC_URI[sha256sum] = "de2b1888718c7a0383060f250589b6ea36fa7afa2be9c4e1b06d29e05b25d4f1"
RDEPENDS_${PN} += "class-singleton-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/DateTime-TimeZone-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
