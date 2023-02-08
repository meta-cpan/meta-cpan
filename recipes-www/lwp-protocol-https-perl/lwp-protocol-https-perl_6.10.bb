DESCRIPTION = "The LWP::Protocol::https module provides support for using https schemed \
URLs with LWP. This module is a plug-in to the LWP protocol handling, so \
you don't use it directly. Once the module is installed LWP is able to \
access sites using HTTP over SSL/TLS."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-Protocol-https"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/LWP-Protocol-https-6.10.tar.gz"

SRC_URI[md5sum] = "cf64e4bc57a9266ac4343cdf0808c5c8"
SRC_URI[sha256sum] = "cecfc31fe2d4fc854cac47fce13d3a502e8fdfe60c5bc1c09535743185f2a86c"
RDEPENDS:${PN} += "io-socket-ssl-perl"
RDEPENDS:${PN} += "libwww-perl-perl"
RDEPENDS:${PN} += "mozilla-ca-perl"
RDEPENDS:${PN} += "net-http-perl"
DEPENDS += "test-requiresinternet-perl-native"

S = "${WORKDIR}/LWP-Protocol-https-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
