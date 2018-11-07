DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the YAML \
1.0 specification. <http://www.yaml.org/spec/>"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-1.27.tar.gz"

SRC_URI[md5sum] = "25ea8d2fb09a2c753b07b1c4e2011ac1"
SRC_URI[sha256sum] = "c992a1e820de0721b62b22521de92cdbf49edc306ab804c485b4b1ec25f682f9"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-yaml-perl-native"

S = "${WORKDIR}/YAML-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
