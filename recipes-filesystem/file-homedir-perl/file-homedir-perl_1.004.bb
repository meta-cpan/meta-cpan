DESCRIPTION = "File::HomeDir is a module for locating the directories that are "owned" by \
a user (typically your user) and to solve the various issues that arise \
trying to find them consistently across a wide variety of platforms."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-HomeDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-HomeDir-1.004.tar.gz"

SRC_URI[md5sum] = "2db6a961960baec790a896b99b46395d"
SRC_URI[sha256sum] = "45f67e2bb5e60a7970d080e8f02079732e5a8dfc0c7c3cbdb29abfb3f9f791ad"
RDEPENDS_${PN} += "file-which-perl"

S = "${WORKDIR}/File-HomeDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
