DESCRIPTION = "** If you are unfamiliar with testing read Test::Tutorial first! **"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.302130.tar.gz"

SRC_URI[md5sum] = "e14e1f1e3a772c1cd56746ad35417e49"
SRC_URI[sha256sum] = "3f9e1f54fb7b2f90481f7c0fbc43938a7dc2126ebf45d007a67db84e9ba534c8"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
