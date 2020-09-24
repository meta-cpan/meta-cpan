DESCRIPTION = "This class is for objects that represent a "cookie jar" -- that is, a \
database of all the HTTP cookies that a given LWP::UserAgent object knows \
about."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Cookies"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Cookies-6.08.tar.gz"

SRC_URI[md5sum] = "8c663710244e70c85775393a8f5be443"
SRC_URI[sha256sum] = "49ebb73576eb41063c04bc079477df094496deec805ae033f3be338c23c3af59"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/HTTP-Cookies-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
