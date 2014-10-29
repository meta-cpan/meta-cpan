DESCRIPTION = "This module lets you peek into archives without extracting them. This is a \
wrapper to the libarchive C libary (http://code.google.com/p/libarchive/), \
which you must have installed (libarchive-dev package for Debian/Ubuntu). It \
supports many different archive formats and compression algorithms and is \
fast."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Archive-Peek-Libarchive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/L/LB/LBROCARD/Archive-Peek-Libarchive-0.37.tar.gz"

SRC_URI[md5sum] = "6fc124ae681f8d026018ae184a04e74e"
SRC_URI[sha256sum] = "0de66d32baf8494fa5d18c7f41223b7337332cafa4ac76419324cac9f8a1390e"
RDEPENDS_${PN} += "object-tiny-perl"
RDEPENDS_${PN} += "libarchive"
DEPENDS += "libarchive"
DEPENDS += "devel-checklib-perl-native"
DEPENDS += "perl"

S = "${WORKDIR}/Archive-Peek-Libarchive-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
