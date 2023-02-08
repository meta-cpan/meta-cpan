DESCRIPTION = "HTTP::Entity::Parser is a PSGI-compliant HTTP Entity parser. This module \
also is compatible with HTTP::Body. Unlike HTTP::Body, HTTP::Entity::Parser \
reads HTTP entities from PSGI's environment "$env->{'psgi.input'}" and \
parses it. This module supports application/x-www-form-urlencoded, \
multipart/form-data and application/json."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Entity-Parser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/HTTP-Entity-Parser-0.25.tar.gz"

SRC_URI[md5sum] = "09663f9577975587e832e28ba5f5f8af"
SRC_URI[sha256sum] = "3a8cd0d8cba3d17cd8c04ee82d7341dfaa247dbdd94a49eb94b53f69e483ec3a"
RDEPENDS:${PN} += "hash-multivalue-perl"
RDEPENDS:${PN} += "http-multipartparser-perl"
RDEPENDS:${PN} += "json-maybexs-perl"
RDEPENDS:${PN} += "stream-buffered-perl"
RDEPENDS:${PN} += "www-form-urlencoded-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/HTTP-Entity-Parser-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
