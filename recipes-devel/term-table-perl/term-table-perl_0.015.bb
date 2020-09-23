DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to generic format rows of data into tables."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Term-Table"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Term-Table-0.015.tar.gz"

SRC_URI[md5sum] = "f23274aec9bc43fe46135d37ae1b5927"
SRC_URI[sha256sum] = "d8a18b2801f91f0e5d747147ce786964a76f91d18568652908a3dc06a9b948d5"
DEPENDS += "test-simple-perl-native"
RDEPENDS_${PN} += "importer-perl"
RRECOMMENDS_${PN} += "scalar-list-utils-perl"
RRECOMMENDS_${PN} += "unicode-linebreak-perl"

S = "${WORKDIR}/Term-Table-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
