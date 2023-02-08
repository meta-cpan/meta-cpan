DESCRIPTION = "This module implements a minimalist HTTP user agent cookie jar in \
conformance with RFC 6265 <http://tools.ietf.org/html/rfc6265>."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-CookieJar"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/HTTP-CookieJar-0.012.tar.gz"

SRC_URI[md5sum] = "278dcbffeb1d0e7cbea461c33aa9b973"
SRC_URI[sha256sum] = "004abff92de3a432f7f7dcd24e082fd6d8b1a74d8af3ae3884b01d1389be604a"
RDEPENDS:${PN} += "http-date-perl"
RRECOMMENDS:${PN} += "mozilla-publicsuffix-perl"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/HTTP-CookieJar-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
