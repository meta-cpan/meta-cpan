DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-TCP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-TCP-2.14.tar.gz"

SRC_URI[md5sum] = "402e78138e3269dde973960dd3d44d09"
SRC_URI[sha256sum] = "b96a3f364748280146fa30a129c72c104133f6768872788b688ea88d4f7d7d01"
RDEPENDS_${PN} += "test-sharedfork-perl"

S = "${WORKDIR}/Test-TCP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
