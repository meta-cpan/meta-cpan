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

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Cookies-6.04.tar.gz"

SRC_URI[md5sum] = "7bf1e277bd5c886bc18d21eb8423b65f"
SRC_URI[sha256sum] = "0cc7f079079dcad8293fea36875ef58dd1bfd75ce1a6c244cd73ed9523eb13d4"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/HTTP-Cookies-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
