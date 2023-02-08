DESCRIPTION = "This module lets you peek into archives without extracting them. This is a \
wrapper to the libarchive C library (http://code.google.com/p/libarchive/), \
which you must have installed (libarchive-dev package for Debian/Ubuntu). \
It supports many different archive formats and compression algorithms and \
is fast."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later | BSD-3-Clause | BSD-2-Clause"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Archive-Peek-Libarchive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9 \
file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=cb641bc04cda31daea161b1bc15da69f"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Archive-Peek-Libarchive-0.38.tar.gz"

SRC_URI[md5sum] = "e302dca7aa91a4ee24e95039ffcbf8e1"
SRC_URI[sha256sum] = "332159603c5cd560da27fd80759da84dad7d8c5b3d96fbf7586de2b264f11b70"
RDEPENDS:${PN} += "object-tiny-perl"
DEPENDS += "libarchive"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"

S = "${WORKDIR}/Archive-Peek-Libarchive-${PV}"

inherit cpan pkgconfig

do_configure() {
	export LD="${CCLD}"
	cpan_do_configure
}

do_compile() {
       export LD="${CCLD}"
       cpan_do_compile
}

BBCLASSEXTEND = "native"
