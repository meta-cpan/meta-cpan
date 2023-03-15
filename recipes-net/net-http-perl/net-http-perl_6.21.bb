DESCRIPTION = "The "Net::HTTP" class is a low-level HTTP client. An instance of the \
"Net::HTTP" class represents a connection to an HTTP server. The HTTP \
protocol is described in RFC 2616. The "Net::HTTP" class supports \
"HTTP/1.0" and "HTTP/1.1"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-HTTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/Net-HTTP-6.21.tar.gz"

SRC_URI[md5sum] = "dbe27483034a79a7d43f61cc48540641"
SRC_URI[sha256sum] = "375aa35b76be99f06464089174d66ac76f78ce83a5c92a907bbfab18b099eec4"
RDEPENDS:${PN} += "uri-perl"
RRECOMMENDS:${PN} += "io-socket-ssl-perl"

S = "${WORKDIR}/Net-HTTP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
