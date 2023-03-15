DESCRIPTION = "File::HomeDir is a module for locating the directories that are "owned" by \
a user (typically your user) and to solve the various issues that arise \
trying to find them consistently across a wide variety of platforms."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-HomeDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-HomeDir-1.006.tar.gz"

SRC_URI[md5sum] = "3a59f74d227fdf97b2af908a2d4fee05"
SRC_URI[sha256sum] = "593737c62df0f6dab5d4122e0b4476417945bb6262c33eedc009665ef1548852"
RDEPENDS:${PN} += "file-which-perl"

S = "${WORKDIR}/File-HomeDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
