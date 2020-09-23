DESCRIPTION = "** If you are unfamiliar with testing read Test::Tutorial first! **"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.302181.tar.gz"

SRC_URI[md5sum] = "658f1acf5483b3a6b8e7a04ddfc38570"
SRC_URI[sha256sum] = "9711ab05d6ea457df5a1baa6879fc9e1df15b23dfc62c15262a7eb297e6e69ab"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
