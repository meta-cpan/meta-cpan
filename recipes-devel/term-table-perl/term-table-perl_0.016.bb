DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to generic format rows of data into tables."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Term-Table"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Term-Table-0.016.tar.gz"

SRC_URI[md5sum] = "ef0c76824c57eaa7796558060067bb49"
SRC_URI[sha256sum] = "8fb4fbb8e96a2d6c514949eb8cfd7e66319bcb1cbf7cea0ab19af887a72d97bf"
RDEPENDS:${PN} += "importer-perl"
RRECOMMENDS:${PN} += "unicode-linebreak-perl"

S = "${WORKDIR}/Term-Table-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
