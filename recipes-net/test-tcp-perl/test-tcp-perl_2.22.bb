DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-TCP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Test-TCP-2.22.tar.gz"

SRC_URI[md5sum] = "d539ad6b16856e863a6b6b54fa58df33"
SRC_URI[sha256sum] = "3e53c3c06d6d0980a2bfeb915602b714e682ee211ae88c11748cf2cc714e7b57"
RDEPENDS:${PN} += "test-sharedfork-perl"

S = "${WORKDIR}/Test-TCP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
