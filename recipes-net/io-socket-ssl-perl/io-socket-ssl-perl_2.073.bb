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
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.073.tar.gz"

SRC_URI[md5sum] = "43232d97e3898b0b0e79545568b7d751"
SRC_URI[sha256sum] = "b2c0b34df97cb1aa816221cee2454a1efd89b86ccbda810389a30e0d08cf57c8"
RDEPENDS:${PN} += "mozilla-ca-perl"
RDEPENDS:${PN} += "net-ssleay-perl"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
