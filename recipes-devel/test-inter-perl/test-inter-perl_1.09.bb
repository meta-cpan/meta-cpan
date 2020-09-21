DESCRIPTION = "This is another framework for writing test scripts. Much of the syntax is \
loosely inspired by Test::More, and Test::Inter has most of it's \
functionality, but it is not a drop-in replacement."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Inter"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SB/SBECK/Test-Inter-1.09.tar.gz"

SRC_URI[md5sum] = "4e9bbe25e28d2453a6c63a1e675cc484"
SRC_URI[sha256sum] = "1e9f129cc1a001fb95449d385253b38afabf5b466e3b3bd33e4e430f216e177a"
DEPENDS += "file-find-rule-perl-native"
DEPENDS += "test-pod-coverage-perl-native"
DEPENDS += "test-pod-perl-native"

S = "${WORKDIR}/Test-Inter-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
