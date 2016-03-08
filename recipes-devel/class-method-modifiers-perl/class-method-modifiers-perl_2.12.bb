DESCRIPTION = "Method modifiers are a convenient feature from the CLOS (Common Lisp Object \
System) world."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Method-Modifiers"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Method-Modifiers-2.12.tar.gz"

SRC_URI[md5sum] = "f55400c7a8134acf3657f8af89bdd7af"
SRC_URI[sha256sum] = "e44c1073020bf55b8c97975ed77235fd7e2a6a56f29b5c702301721184e27ac8"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Class-Method-Modifiers-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
