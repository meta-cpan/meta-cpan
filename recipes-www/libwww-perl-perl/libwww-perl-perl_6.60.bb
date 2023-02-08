DESCRIPTION = "The libwww-perl collection is a set of Perl modules which provides a simple \
and consistent application programming interface (API) to the World-Wide \
Web. The main focus of the library is to provide classes and functions that \
allow you to write WWW clients. The library also contain modules that are \
of more general use and even classes that help you implement simple HTTP \
servers."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/libwww-perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/libwww-perl-6.60.tar.gz"

SRC_URI[md5sum] = "ce5180358d9279b2843a6518bf2de200"
SRC_URI[sha256sum] = "cdd28b9237b9c6791725b9099695c7c3c720b33881606fd6cc7635a5495bb07c"
RDEPENDS:${PN} += "encode-locale-perl"
RDEPENDS:${PN} += "file-listing-perl"
RDEPENDS:${PN} += "html-parser-perl"
RDEPENDS:${PN} += "http-cookies-perl"
RDEPENDS:${PN} += "http-date-perl"
RDEPENDS:${PN} += "http-message-perl"
RDEPENDS:${PN} += "http-negotiate-perl"
RDEPENDS:${PN} += "lwp-mediatypes-perl"
RDEPENDS:${PN} += "net-http-perl"
RDEPENDS:${PN} += "try-tiny-perl"
RDEPENDS:${PN} += "uri-perl"
RDEPENDS:${PN} += "www-robotrules-perl"
DEPENDS += "http-daemon-perl-native"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requiresinternet-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/libwww-perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
