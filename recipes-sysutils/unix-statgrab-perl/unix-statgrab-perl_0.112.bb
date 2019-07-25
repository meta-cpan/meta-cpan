DESCRIPTION = "Unix::Statgrab is a wrapper for libstatgrab as available from \
<http://www.i-scream.org/libstatgrab/>. It is a reasonably portable attempt \
to query interesting stats about your computer. It covers information on \
the operating system, CPU, memory usage, network interfaces, hard-disks \
etc."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+ | LGPLv2.1"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unix-Statgrab"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d \
file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Unix-Statgrab-0.112.tar.gz"

SRC_URI[md5sum] = "a6bc06b3f7749f7d77a2b1bd13402821"
SRC_URI[sha256sum] = "16a29f7acaeec081bf0e7303ba5ee24fda1d21a1104669b837745f3ea61d6afa"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "libstatgrab"
RDEPENDS_${PN} += "perl libstatgrab"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Unix-Statgrab-${PV}"

inherit cpan pkgconfig

do_configure() {
        export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
        cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
