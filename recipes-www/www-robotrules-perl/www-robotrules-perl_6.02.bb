DESCRIPTION = "This module parses /robots.txt files as specified in "A Standard for Robot \
Exclusion", at <http://www.robotstxt.org/wc/norobots.html> Webmasters can \
use the /robots.txt file to forbid conforming robots from accessing parts \
of their web site."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/WWW-RobotRules"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GAAS/WWW-RobotRules-6.02.tar.gz"

SRC_URI[md5sum] = "b7186e8b8b3701e70c22abf430742403"
SRC_URI[sha256sum] = "46b502e7a288d559429891eeb5d979461dd3ecc6a5c491ead85d165b6e03a51e"
RDEPENDS:${PN} += "uri-perl"

S = "${WORKDIR}/WWW-RobotRules-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
