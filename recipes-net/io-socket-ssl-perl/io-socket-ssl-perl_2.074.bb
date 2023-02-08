DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the necessary \
functionality into the familiar IO::Socket interface and providing secure \
defaults whenever possible. This way, existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and don't \
use select or poll."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-SSL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.074.tar.gz"

SRC_URI[md5sum] = "53201b8e4dfaf25d4d661a54fdfda602"
SRC_URI[sha256sum] = "36486b6be49da4d029819cf7069a7b41ed48af0c87e23be0f8e6aba23d08a832"
RDEPENDS:${PN} += "mozilla-ca-perl"
RDEPENDS:${PN} += "net-ssleay-perl"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
