DESCRIPTION = "Perl YAML Serialization using XS and libyaml"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

CLEANBROKEN = "1"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML-LibYAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-LibYAML-0.82.tar.gz"

SRC_URI[md5sum] = "4db5ef409e87afece037f4a5423be9cd"
SRC_URI[sha256sum] = "02b4c7a3965c6cce173658f31217b9a3884edcc52ce058a8f58c69a56687fe48"

S = "${WORKDIR}/YAML-LibYAML-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
