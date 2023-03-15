DESCRIPTION = "This module is a collection of tests useful for dealing with utf8 strings \
in Perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-utf8"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MARKF/Test-utf8-1.02.tar.gz"

SRC_URI[md5sum] = "71d187539c76ac1ed9a0242ff208796d"
SRC_URI[sha256sum] = "df82f09c5940830b25a49f1c8162fa24d371e602880edef8d9a4d4bfd66b8bd7"

S = "${WORKDIR}/Test-utf8-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
