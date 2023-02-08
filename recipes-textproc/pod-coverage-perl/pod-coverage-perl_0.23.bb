DESCRIPTION = "Developers hate writing documentation. They'd hate it even more if their \
computer tattled on them, but maybe they'll be even more thankful in the \
long run. Even if not, perlmodstyle tells you to, so you must obey."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Pod-Coverage"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Pod-Coverage-0.23.tar.gz"

SRC_URI[md5sum] = "12229e553ee7887680ee3db11da5ee52"
SRC_URI[sha256sum] = "30b7a0b0c942f44a7552c0d34e9b1f2e0ba0b67955c61e3b1589ec369074b107"
RDEPENDS:${PN} += "devel-symdump-perl"

S = "${WORKDIR}/Pod-Coverage-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
