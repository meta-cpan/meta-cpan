DESCRIPTION = "The libwww-perl collection is a set of Perl modules which provides a simple \
and consistent application programming interface (API) to the World-Wide \
Web. The main focus of the library is to provide classes and functions that \
allow you to write WWW clients. The library also contain modules that are \
of more general use and even classes that help you implement simple HTTP \
servers."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/libwww-perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/libwww-perl-6.15.tar.gz"

SRC_URI[md5sum] = "6888c9d8728cd6f3ea3c9754461c9f94"
SRC_URI[sha256sum] = "6f349d45c21b1ec0501c4437dfcb70570940e6c3d5bff783bd91d4cddead8322"
RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "file-listing-perl"
RDEPENDS_${PN} += "html-parser-perl"
RDEPENDS_${PN} += "http-cookies-perl"
RDEPENDS_${PN} += "http-daemon-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "http-negotiate-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
RDEPENDS_${PN} += "net-http-perl"
RDEPENDS_${PN} += "uri-perl"
RDEPENDS_${PN} += "www-robotrules-perl"

S = "${WORKDIR}/libwww-perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
