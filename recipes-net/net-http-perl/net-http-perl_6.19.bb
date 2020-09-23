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

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/Net-HTTP-6.19.tar.gz"

SRC_URI[md5sum] = "6cbebcc76099ce822f0aa7764af11f73"
SRC_URI[sha256sum] = "52b76ec13959522cae64d965f15da3d99dcb445eddd85d2ce4e4f4df385b2fc4"
RDEPENDS_${PN} += "uri-perl"

S = "${WORKDIR}/Net-HTTP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
