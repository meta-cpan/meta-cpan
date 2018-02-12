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

SRC_URI = "git://github.com/rehsack/Archive-Peek-Libarchive.git"
SRCREV = "6d51ab93f9308ad6ee4d25d9cae1d91573d7a62a"

RDEPENDS_${PN} += "object-tiny-perl"
RDEPENDS_${PN} += "libarchive"
DEPENDS += "libarchive"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "perl"

S = "${WORKDIR}/git"

inherit cpan pkgconfig

do_configure() {
        export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
        cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
