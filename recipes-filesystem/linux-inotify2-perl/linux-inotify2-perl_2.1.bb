DESCRIPTION = "This module implements an interface to the Linux 2.6.13 and later Inotify \
file/directory change notification system."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Linux-Inotify2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/Linux-Inotify2-2.1.tar.gz"

SRC_URI[md5sum] = "cf625681c5234f4edffc49f7c45e2239"
SRC_URI[sha256sum] = "7265b674380026011df82b9d6219a4c980bcdc0efe913119d04878790bf6f270"
RDEPENDS_${PN} += "common-sense-perl"

S = "${WORKDIR}/Linux-Inotify2-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
