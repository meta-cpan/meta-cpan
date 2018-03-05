DESCRIPTION = "CGI.pm is a stable, complete and mature solution for processing and \
preparing HTTP requests and responses. Major features including processing \
form submissions, file uploads, reading and writing cookies, query string \
generation and manipulation, and processing and preparing HTTP headers."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CGI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEEJO/CGI-4.38.tar.gz"

SRC_URI[md5sum] = "0aeb8563d533e7f83724ed068b5bfc37"
SRC_URI[sha256sum] = "8c58f4a529bb92a914b22b7e64c5e31185c9854a4070a6dfad44fe5cc248e7d4"
RDEPENDS_${PN} += "html-parser-perl"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-nowarnings-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/CGI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
