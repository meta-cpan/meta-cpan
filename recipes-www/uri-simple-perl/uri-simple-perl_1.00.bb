DESCRIPTION = "This module is a direct port of javascript parseURI regex by Steven \
Levithan Please See Original Code \
<http://blog.stevenlevithan.com/archives/parseuri>"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAMOD/URI-Simple-1.00.tar.gz"

SRC_URI[md5sum] = "94eddcb8bad3afe78f9dbde08cfeadb9"
SRC_URI[sha256sum] = "ba57b04eeeb85c3ea6724c6c5ae1431ab246bca98b362ca3968a17ec7015f613"

S = "${WORKDIR}/URI-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
