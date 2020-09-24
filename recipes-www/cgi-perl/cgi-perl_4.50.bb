DESCRIPTION = "CGI.pm is a stable, complete and mature solution for processing and \
preparing HTTP requests and responses. Major features including processing \
form submissions, file uploads, reading and writing cookies, query string \
generation and manipulation, and processing and preparing HTTP headers."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CGI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEEJO/CGI-4.50.tar.gz"

SRC_URI[md5sum] = "6c7c9d0c272849f3c3c1859cb78962fe"
SRC_URI[sha256sum] = "d8c7a2143352842a9b4962c314ee7e0385273c8b9d8314dcbd04a09c008eef46"
RDEPENDS_${PN} += "html-parser-perl"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-nowarnings-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/CGI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
