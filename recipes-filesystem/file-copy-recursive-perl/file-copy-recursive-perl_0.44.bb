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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMUEY/File-Copy-Recursive-0.44.tar.gz"

SRC_URI[md5sum] = "6a89eb075d15df85da1778755c72ba6b"
SRC_URI[sha256sum] = "ae19a0b58dc1b3cded9ba9cfb109288d8973d474c0b4bfd28b27cf60e8ca6ee4"
DEPENDS += "path-tiny-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-file-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/File-Copy-Recursive-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
