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

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEEJO/CGI-4.53.tar.gz"

SRC_URI[md5sum] = "a0fe86a038de743ac45a0933daa2804f"
SRC_URI[sha256sum] = "c67e732f3c96bcb505405fd944f131fe5c57b46e5d02885c00714c452bf14e60"
RDEPENDS:${PN} += "html-parser-perl"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-nowarnings-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/CGI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
