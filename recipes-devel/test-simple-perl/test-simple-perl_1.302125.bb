DESCRIPTION = "** If you are unfamiliar with testing read Test::Tutorial first! **"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.302125.tar.gz"

SRC_URI[md5sum] = "3240a535d22ca1e09d65b178f6596095"
SRC_URI[sha256sum] = "8a3785a4fa60c4c5ae0c5cac2f3312242f2b36ca20e368d8a9ec22b4061aa317"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
