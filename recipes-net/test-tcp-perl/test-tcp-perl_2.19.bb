DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-TCP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-TCP-2.19.tar.gz"

SRC_URI[md5sum] = "1c9f50fd13733a9a760808ec530fe295"
SRC_URI[sha256sum] = "dd012d9d596b2a4e26feb5e017ed8035bf779f636da78b8ae4f5f581e9fc5091"
RDEPENDS_${PN} += "test-sharedfork-perl"

S = "${WORKDIR}/Test-TCP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
