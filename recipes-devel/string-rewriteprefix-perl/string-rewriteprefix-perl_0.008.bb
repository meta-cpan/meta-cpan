DESCRIPTION = "rewrite strings based on a set of known prefixes"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-RewritePrefix"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/String-RewritePrefix-0.008.tar.gz"

SRC_URI[md5sum] = "af3e7375bed768ea7494ff53b80b81c0"
SRC_URI[sha256sum] = "e45a31d6914e8f5fc722ef48d8819400dafc02105e0c61414aabbf01bce208eb"
RDEPENDS_${PN} += "sub-exporter-perl"

S = "${WORKDIR}/String-RewritePrefix-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
