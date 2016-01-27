DESCRIPTION = "This module allows a program to respond asynchronously to HTTP requests, as \
part of a program based on IO::Async. An object in this class listens on a \
single port and invokes the "on_request" callback or subclass method \
whenever an HTTP request is received, allowing the program to respond to \
it."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Async-HTTP-Server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Net-Async-HTTP-Server-0.09.tar.gz"

SRC_URI[md5sum] = "4b13d36f2a309cde31df7c154aa3af46"
SRC_URI[sha256sum] = "62c444514a5b673128e1d5b28efb16fa367035437d76c552d64faf7045d82e48"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "io-async-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Net-Async-HTTP-Server-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
