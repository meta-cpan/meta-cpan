DESCRIPTION = "Perl YAML Serialization using XS and libyaml"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

CLEANBROKEN = "1"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML-LibYAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-LibYAML-0.83.tar.gz"

SRC_URI[md5sum] = "5c019115eae8079e74a407c74c4564f0"
SRC_URI[sha256sum] = "b47175b4ff397ad75a4f7781d3d83c08637da6ff0bae326af3b389d854bec490"

S = "${WORKDIR}/YAML-LibYAML-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
