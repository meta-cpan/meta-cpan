DESCRIPTION = "This module implements a minimalist HTTP user agent cookie jar in \
conformance with RFC 6265 <http://tools.ietf.org/html/rfc6265>."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-CookieJar"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/HTTP-CookieJar-0.008.tar.gz"

SRC_URI[md5sum] = "e30a933e9cc0cf6f0b67054cbb01141f"
SRC_URI[sha256sum] = "9507e039279f4c0deed7fcee8fadec5029b8a933c81eb78e7e8faaccb632dc65"
RDEPENDS_${PN} += "http-date-perl"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/HTTP-CookieJar-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
