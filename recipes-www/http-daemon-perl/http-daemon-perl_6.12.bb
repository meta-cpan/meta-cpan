DESCRIPTION = "Instances of the "HTTP::Daemon" class are HTTP/1.1 servers that listen on a \
socket for incoming requests. The "HTTP::Daemon" is a subclass of \
"IO::Socket::IP", so you can perform socket operations directly on it too."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Daemon"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Daemon-6.12.tar.gz"

SRC_URI[md5sum] = "63674e3f81760a29075853413eb157d8"
SRC_URI[sha256sum] = "df47bed10c38670c780fd0116867d5fd4693604acde31ba63380dce04c4e1fa6"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
DEPENDS += "test-needs-perl-native"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/HTTP-Daemon-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
