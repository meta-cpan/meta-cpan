DESCRIPTION = "The functions exported by this module deal with runtime handling of Perl \
modules, which are normally handled at compile time. This module avoids \
using any other modules, so that it can be used in low-level \
infrastructure."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Runtime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Module-Runtime-0.016.tar.gz"

SRC_URI[md5sum] = "d3d47222fa2e3dfcb4526f6cc8437b20"
SRC_URI[sha256sum] = "68302ec646833547d410be28e09676db75006f4aa58a11f3bdb44ffe99f0f024"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Module-Runtime-${PV}"

DEPENDS += "module-build-perl-native"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
