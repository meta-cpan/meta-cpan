DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the YAML \
1.0 specification. <http://www.yaml.org/spec/>"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-1.30.tar.gz"

SRC_URI[md5sum] = "2c861f02e091787c7fe115ec20d3b9b3"
SRC_URI[sha256sum] = "5030a6d6cbffaf12583050bf552aa800d4646ca9678c187add649227f57479cd"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-yaml-perl-native"

S = "${WORKDIR}/YAML-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
