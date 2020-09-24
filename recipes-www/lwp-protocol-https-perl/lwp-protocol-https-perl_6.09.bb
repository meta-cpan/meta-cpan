DESCRIPTION = "The LWP::Protocol::https module provides support for using https schemed \
URLs with LWP. This module is a plug-in to the LWP protocol handling, so \
you don't use it directly. Once the module is installed LWP is able to \
access sites using HTTP over SSL/TLS."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-Protocol-https"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/LWP-Protocol-https-6.09.tar.gz"

SRC_URI[md5sum] = "6d497ec74f3cf88ad41898fcb8b01145"
SRC_URI[sha256sum] = "16cfe1a511690b066db5667c8714802ee2b9c5d28a31a3e7bd36fbc70a3af592"
RDEPENDS_${PN} += "io-socket-ssl-perl"
RDEPENDS_${PN} += "libwww-perl-perl"
RDEPENDS_${PN} += "mozilla-ca-perl"
RDEPENDS_${PN} += "net-http-perl"
DEPENDS += "test-requiresinternet-perl-native"

S = "${WORKDIR}/LWP-Protocol-https-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
