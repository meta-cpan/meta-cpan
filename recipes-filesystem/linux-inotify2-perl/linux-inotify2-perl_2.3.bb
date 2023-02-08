DESCRIPTION = "This module implements an interface to the Linux 2.6.13 and later Inotify \
file/directory change notification system."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Linux-Inotify2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/Linux-Inotify2-2.3.tar.gz"

SRC_URI[md5sum] = "2ef33c2f80104c6187a950fb7d3075fe"
SRC_URI[sha256sum] = "cb99150f9ffa51dbc3be5ee98d8e91c98cdfeae22eb88e718f2cf367bf270d17"
RDEPENDS:${PN} += "common-sense-perl"

S = "${WORKDIR}/Linux-Inotify2-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
