DESCRIPTION = "This module allows a program to respond asynchronously to HTTP requests, as \
part of a program based on IO::Async. An object in this class listens on a \
single port and invokes the "on_request" callback or subclass method \
whenever an HTTP request is received, allowing the program to respond to \
it."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Async-HTTP-Server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Net-Async-HTTP-Server-0.13.tar.gz"

SRC_URI[md5sum] = "9bbd282f5b5b06d0a643511b6fdd633b"
SRC_URI[sha256sum] = "ca4de471f22278d2393c8ab2ec6e7ac4ef217db4635d2dcc8ba2a8ca722114ee"
RDEPENDS:${PN} += "http-message-perl"
RDEPENDS:${PN} += "io-async-perl"
RDEPENDS:${PN} += "metrics-any-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-metrics-any-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Net-Async-HTTP-Server-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
