DESCRIPTION = "This class is for objects that represent a "cookie jar" -- that is, a \
database of all the HTTP cookies that a given LWP::UserAgent object knows \
about."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Cookies"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Cookies-6.10.tar.gz"

SRC_URI[md5sum] = "b4d7804231b1dfd10999d42283e0cf06"
SRC_URI[sha256sum] = "e36f36633c5ce6b5e4b876ffcf74787cc5efe0736dd7f487bdd73c14f0bd7007"
RDEPENDS:${PN} += "http-date-perl"
RDEPENDS:${PN} += "http-message-perl"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/HTTP-Cookies-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
