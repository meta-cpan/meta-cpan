DESCRIPTION = ""Role::Tiny" is a minimalist role composition tool."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Role-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Role-Tiny-2.001004.tar.gz"

SRC_URI[md5sum] = "98446826608b1e943e65c1f6e35942fe"
SRC_URI[sha256sum] = "92ba5712850a74102c93c942eb6e7f62f7a4f8f483734ed289d08b324c281687"
RRECOMMENDS_${PN} += "class-method-modifiers-perl"

S = "${WORKDIR}/Role-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
