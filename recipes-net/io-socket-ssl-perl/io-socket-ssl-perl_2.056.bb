DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the necessary \
functionality into the familiar IO::Socket interface and providing secure \
defaults whenever possible. This way, existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and don't \
use select or poll."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-SSL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.056.tar.gz"

SRC_URI[md5sum] = "7f575fd3844263a3401dc6e1fe3ad44c"
SRC_URI[sha256sum] = "91451ecc28b243a78b438f0a42db24c4b60a86f088879b38e40bdbd697818259"
RDEPENDS_${PN} += "net-ssleay-perl"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
