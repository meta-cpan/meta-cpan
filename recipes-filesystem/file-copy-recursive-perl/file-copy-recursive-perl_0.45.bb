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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMUEY/File-Copy-Recursive-0.45.tar.gz"

SRC_URI[md5sum] = "e5eee1a3f8ae3aebbac063ea54870e54"
SRC_URI[sha256sum] = "d3971cf78a8345e38042b208bb7b39cb695080386af629f4a04ffd6549df1157"
DEPENDS += "path-tiny-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-file-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/File-Copy-Recursive-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
