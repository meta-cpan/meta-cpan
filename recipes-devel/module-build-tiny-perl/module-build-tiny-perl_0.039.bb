DESCRIPTION = "Many Perl distributions use a Build.PL file instead of a Makefile.PL file \
to drive distribution configuration, build, test and installation. \
Traditionally, Build.PL uses Module::Build as the underlying build system. \
This module provides a simple, lightweight, drop-in replacement."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-Tiny-0.039.tar.gz"

SRC_URI[md5sum] = "2332c90c17454107fea3f2614e11a3a9"
SRC_URI[sha256sum] = "7d580ff6ace0cbe555bf36b86dc8ea232581530cbeaaea09bccb57b55797f11c"
RDEPENDS:${PN} += "extutils-config-perl"
RDEPENDS:${PN} += "extutils-helpers-perl"
RDEPENDS:${PN} += "extutils-installpaths-perl"
DEPENDS += "extutils-config-perl-native"
DEPENDS += "extutils-helpers-perl-native"
DEPENDS += "extutils-installpaths-perl-native"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
