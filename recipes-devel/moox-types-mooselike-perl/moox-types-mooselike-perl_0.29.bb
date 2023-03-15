DESCRIPTION = "This module provides a possibility to build your own set of Moose-like \
types. These custom types can then be used to describe fields in Moo-based \
classes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Types-MooseLike"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MATEU/MooX-Types-MooseLike-0.29.tar.gz"

SRC_URI[md5sum] = "0905b92c1b44578e05e7f08fa7adb9ee"
SRC_URI[sha256sum] = "1d3780aa9bea430afbe65aa8c76e718f1045ce788aadda4116f59d3b7a7ad2b4"
RDEPENDS:${PN} += "module-runtime-perl"
RRECOMMENDS:${PN} += "strictures-perl"
DEPENDS += "moo-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/MooX-Types-MooseLike-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
