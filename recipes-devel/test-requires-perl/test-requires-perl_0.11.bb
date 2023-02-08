DESCRIPTION = "Test::Requires checks to see if the module can be loaded."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Requires"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-Requires-0.11.tar.gz"

SRC_URI[md5sum] = "999d6c4e46ea7baae7a5113292e02ed8"
SRC_URI[sha256sum] = "4b88de549597eecddf7c3c38a4d0204a16f59ad804577b671896ac04e24e040f"

S = "${WORKDIR}/Test-Requires-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
