DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-TCP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-TCP-2.13.tar.gz"

SRC_URI[md5sum] = "e0006119a9c1008d0bcf210afd1ed165"
SRC_URI[sha256sum] = "226383c0a6de901f43ed5b011308fa229d7d6cd5e32aaa6095cddcd3d030ed7a"
RDEPENDS_${PN} += "test-sharedfork-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/Test-TCP-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
