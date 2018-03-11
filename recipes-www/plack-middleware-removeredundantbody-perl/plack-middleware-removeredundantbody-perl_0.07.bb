DESCRIPTION = "This module removes body in HTTP response, if it's not required."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack-Middleware-RemoveRedundantBody"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SW/SWEETKID/Plack-Middleware-RemoveRedundantBody-0.07.tar.gz"

SRC_URI[md5sum] = "8f3ad4aad7793687c338635af89c360c"
SRC_URI[sha256sum] = "64b841d5d74b4c4a595b85749d69297f4f5f5c0829a6e99e0099f05dd69be3c3"
RDEPENDS_${PN} += "plack-perl"
DEPENDS += "http-message-perl-native"

S = "${WORKDIR}/Plack-Middleware-RemoveRedundantBody-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
