DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-0.10.tar.gz"

SRC_URI[md5sum] = "20f6f16689df949db86645652c1ebe38"
SRC_URI[sha256sum] = "b42bad15b12da4cdc5c90c902faf3ad484281a42203fa4e7652866434f6fa4dd"
RDEPENDS_${PN} += "uri-perl"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-time-perl-native"

S = "${WORKDIR}/Cookie-Baker-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
