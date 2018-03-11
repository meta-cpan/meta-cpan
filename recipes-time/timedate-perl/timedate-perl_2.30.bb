DESCRIPTION = ""Date::Parse" provides two routines for parsing date strings into time \
values."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/TimeDate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GB/GBARR/TimeDate-2.30.tar.gz"

SRC_URI[md5sum] = "b1d91153ac971347aee84292ed886c1c"
SRC_URI[sha256sum] = "75bd254871cb5853a6aa0403ac0be270cdd75c9d1b6639f18ecba63c15298e86"

S = "${WORKDIR}/TimeDate-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
