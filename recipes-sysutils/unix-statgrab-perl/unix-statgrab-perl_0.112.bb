DESCRIPTION = "Unix::Statgrab is a wrapper for libstatgrab as available from \
<http://www.i-scream.org/libstatgrab/>. It is a reasonably portable attempt \
to query interesting stats about your computer. It covers information on \
the operating system, CPU, memory usage, network interfaces, hard-disks \
etc."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later | LGPL-2.1-only"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unix-Statgrab"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
file://${COMMON_LICENSE_DIR}/LGPL-2.1-only;md5=1a6d268fd218675ffea8be556788b780"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Unix-Statgrab-0.112.tar.gz"

SRC_URI[md5sum] = "a6bc06b3f7749f7d77a2b1bd13402821"
SRC_URI[sha256sum] = "16a29f7acaeec081bf0e7303ba5ee24fda1d21a1104669b837745f3ea61d6afa"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "libstatgrab"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Unix-Statgrab-${PV}"

inherit cpan pkgconfig

do_configure() {
	export LD="${CCLD}"
	cpan_do_configure
}

BBCLASSEXTEND = "native"
