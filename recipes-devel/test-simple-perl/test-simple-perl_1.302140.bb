DESCRIPTION = "** If you are unfamiliar with testing read Test::Tutorial first! **"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.302140.tar.gz"

SRC_URI[md5sum] = "2a3eba9fbafe80a24ce75b604ab045f1"
SRC_URI[sha256sum] = "73f5440c7ae55e13706e9ebeaa7247df973226470f028344ea3cd21e1642bd1d"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
