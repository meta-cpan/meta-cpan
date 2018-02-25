DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the YAML \
1.0 specification. <http://www.yaml.org/spec/>"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-1.24.tar.gz"

SRC_URI[md5sum] = "407a17fc567b692d8da028c10d3a9951"
SRC_URI[sha256sum] = "b58d045a72a5e1ce714f1d42b64ccddbb055a4afac10b74972dba3b6a47dffb6"
RRECOMMENDS_${PN} += "yaml-libyaml-perl"
DEPENDS += "test-yaml-perl-native"

S = "${WORKDIR}/YAML-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
