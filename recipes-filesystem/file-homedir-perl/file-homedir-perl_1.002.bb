DESCRIPTION = "File::HomeDir is a module for locating the directories that are "owned" by \
a user (typicaly your user) and to solve the various issues that arise \
trying to find them consistently across a wide variety of platforms."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-HomeDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-HomeDir-1.002.tar.gz"

SRC_URI[md5sum] = "1e999956661fbee165b088eedb5fee3c"
SRC_URI[sha256sum] = "eb4c0c85775138460cd4013d8117232f08e88381c95c6a93b3d11e969185c274"
RDEPENDS_${PN} += "file-which-perl"

S = "${WORKDIR}/File-HomeDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
