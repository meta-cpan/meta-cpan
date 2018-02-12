DESCRIPTION = ""Role::Tiny" is a minimalist role composition tool."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Role-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Role-Tiny-2.000006.tar.gz"

SRC_URI[md5sum] = "7c277728a7e090f64b495857cadfed08"
SRC_URI[sha256sum] = "cc73418c904a0286ecd8915eac11f5be2a8d1e17ea9cb54c9116b0340cd3e382"
RRECOMMENDS_${PN} += "class-method-modifiers-perl"

S = "${WORKDIR}/Role-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
