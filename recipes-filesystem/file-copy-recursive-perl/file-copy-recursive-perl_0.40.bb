DESCRIPTION = "This module copies and moves directories recursively (or single files, \
well... singley) to an optional depth and attempts to preserve each file or \
directory's mode."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Copy-Recursive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMUEY/File-Copy-Recursive-0.40.tar.gz"

SRC_URI[md5sum] = "659c634f248885c4b3876b15baf56c79"
SRC_URI[sha256sum] = "e8b8923b930ef7bcb59d4a97456d0e149b8487597cd1550f836451d936ce55a1"
RDEPENDS_${PN} += "path-tiny-perl"
RDEPENDS_${PN} += "test-deep-perl"
RDEPENDS_${PN} += "test-exception-perl"
RDEPENDS_${PN} += "test-warn-perl"

S = "${WORKDIR}/File-Copy-Recursive-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
