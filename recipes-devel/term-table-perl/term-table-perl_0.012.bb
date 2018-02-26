DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to generic format rows of data into tables."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Term-Table"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Term-Table-0.012.tar.gz"

SRC_URI[md5sum] = "a38cad6182e2c4864752746f1035abbd"
SRC_URI[sha256sum] = "4db6118fbf862bd32a8402e1ee28ce2044d0e0887ef29b726e917ab4258a063a"
DEPENDS += "test-simple-perl-native"
RRECOMMENDS_${PN} += "scalar-list-utils-perl"

S = "${WORKDIR}/Term-Table-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
