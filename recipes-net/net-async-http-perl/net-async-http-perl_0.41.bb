DESCRIPTION = "This object class implements an asynchronous HTTP user agent. It sends \
requests to servers, returning Future instances to yield responses when \
they are received. The object supports multiple concurrent connections to \
servers, and allows multiple requests in the pipeline to any one \
connection. Normally, only one such object will be needed per program to \
support any number of requests."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Async-HTTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Net-Async-HTTP-0.41.tar.gz"

SRC_URI[md5sum] = "b397cce81470010d8f11dfb6f96545ab"
SRC_URI[sha256sum] = "90b86986bf38f5eeadd0f4171332f290d24abdb568fd2e7e846a50ba61ebfbd3"
RDEPENDS_${PN} += "future-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "io-async-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
RDEPENDS_${PN} += "uri-perl"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Net-Async-HTTP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
