DESCRIPTION = "The UNIVERSAL class provides a few default methods so that all objects can \
use them. Object orientation allows programmers to override these methods \
in subclasses to provide more specific and appropriate behavior."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/UNIVERSAL-can"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHROMATIC/UNIVERSAL-can-1.20140328.tar.gz"

SRC_URI[md5sum] = "7b89d16d59f0d27e45b25fd31300334e"
SRC_URI[sha256sum] = "522da9f274786fe2cba99bc77cc1c81d2161947903d7fad10bd62dfb7f11990f"
RRECOMMENDS_${PN} += "scalar-list-utils-perl"

S = "${WORKDIR}/UNIVERSAL-can-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
