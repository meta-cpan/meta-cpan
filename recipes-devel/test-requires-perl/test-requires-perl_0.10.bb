DESCRIPTION = "Test::Requires checks to see if the module can be loaded."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Requires"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-Requires-0.10.tar.gz"

SRC_URI[md5sum] = "0d5da779609d0c8fa6f796b45ff8c6f3"
SRC_URI[sha256sum] = "2768a391d50ab94b95cefe540b9232d7046c13ee86d01859e04c044903222eb5"

S = "${WORKDIR}/Test-Requires-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
