DESCRIPTION = "This module provides functions that deal the date formats used by the HTTP \
protocol (and then some more). Only the first two functions, time2str() and \
str2time(), are exported by default."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Date"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTTP-Date-6.05.tar.gz"

SRC_URI[md5sum] = "2ecbb3aedf6aef062605191813ca3027"
SRC_URI[sha256sum] = "365d6294dfbd37ebc51def8b65b81eb79b3934ecbc95a2ec2d4d827efe6a922b"
RDEPENDS:${PN} += "timedate-perl"

S = "${WORKDIR}/HTTP-Date-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
