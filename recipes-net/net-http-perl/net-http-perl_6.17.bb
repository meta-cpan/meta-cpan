DESCRIPTION = "The "Net::HTTP" class is a low-level HTTP client. An instance of the \
"Net::HTTP" class represents a connection to an HTTP server. The HTTP \
protocol is described in RFC 2616. The "Net::HTTP" class supports \
"HTTP/1.0" and "HTTP/1.1"."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-HTTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/Net-HTTP-6.17.tar.gz"

SRC_URI[md5sum] = "068fa02fd3c8a5b63316025b5a24844c"
SRC_URI[sha256sum] = "1e8624b1618dc6f7f605f5545643ebb9b833930f4d7485d4124aa2f2f26d1611"
RDEPENDS_${PN} += "uri-perl"

S = "${WORKDIR}/Net-HTTP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
