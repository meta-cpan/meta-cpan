DESCRIPTION = "This modules provides a collection of test utilities for file attributes."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-File"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Test-File-1.443.tar.gz"

SRC_URI[md5sum] = "ec8c6f6e940b454e110aaaa663fc761c"
SRC_URI[sha256sum] = "61b4a6ab8f617c8c7b5975164cf619468dc304b6baaaea3527829286fa58bcd5"

S = "${WORKDIR}/Test-File-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
