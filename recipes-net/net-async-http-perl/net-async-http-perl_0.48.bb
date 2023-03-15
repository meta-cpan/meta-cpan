DESCRIPTION = "This object class implements an asynchronous HTTP user agent. It sends \
requests to servers, returning Future instances to yield responses when \
they are received. The object supports multiple concurrent connections to \
servers, and allows multiple requests in the pipeline to any one \
connection. Normally, only one such object will be needed per program to \
support any number of requests."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Async-HTTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Net-Async-HTTP-0.48.tar.gz"

SRC_URI[md5sum] = "03cc0e1ff997c69f6b493806ad21ea35"
SRC_URI[sha256sum] = "9d4bd6f995bcae7d8bcd3a2b368ee708ede484006b6228f5ed25ebf3a821f73e"
RDEPENDS:${PN} += "future-perl"
RDEPENDS:${PN} += "http-message-perl"
RDEPENDS:${PN} += "io-async-perl"
RDEPENDS:${PN} += "metrics-any-perl"
RDEPENDS:${PN} += "struct-dumb-perl"
RDEPENDS:${PN} += "uri-perl"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-metrics-any-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Net-Async-HTTP-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
