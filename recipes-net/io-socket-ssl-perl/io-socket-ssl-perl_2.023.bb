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

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.023.tar.gz"

SRC_URI[md5sum] = "89df81cbc1c477937fdcfa8fea173a48"
SRC_URI[sha256sum] = "49ae36c6e881072229c17dee6b4d4f24e9ec9c40cdde1b0bd09903d87981f9e5"
RDEPENDS_${PN} += "mozilla-ca-perl"
RDEPENDS_${PN} += "net-ssleay-perl"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
