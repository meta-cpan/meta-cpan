DESCRIPTION = "The main URL::Encode package will use this package automatically if it can \
find it. Do not use this package directly, use URL::Encode instead."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URL-Encode-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = " https://cpan.metacpan.org/authors/id/C/CH/CHANSEN/URL-Encode-XS-0.03.tar.gz \
            file://Makefile_PL_add-dot-to-INC.patch \
"

SRC_URI[md5sum] = "1e587f85b6e65b5c4dbc148b57520d48"
SRC_URI[sha256sum] = "d44f416bd3e58e3b3366ab420705da02c7118fc848a97ce089366ea0461fa823"
RDEPENDS_${PN} += "url-encode-perl"

S = "${WORKDIR}/URL-Encode-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
