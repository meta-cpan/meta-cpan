DESCRIPTION = "Unix::Statgrab is a wrapper for libstatgrab as available from \
<http://www.i-scream.org/libstatgrab/>. It is a reasonably portable attempt \
to query interesting stats about your computer. It covers information on the \
operating system, CPU, memory usage, network interfaces, hard-disks etc."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unix-Statgrab"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/i-scream/Unix-Statgrab.git"
SRCREV = "8d450aa72879ff38c6c6e9b38651434323c34961"

DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "perl libstatgrab"

S = "${WORKDIR}/git"

inherit cpan pkgconfig

do_configure() {
        export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
        cpan_do_configure
	# sed -i -e "s,\-lstatgrab,-L${STAGING_DIR_TARGET}/usr/lib -lstatgrab,g" ${S}/Makefile
	sed -i -e "s,\-lstatgrab,-v -lstatgrab,g" ${S}/Makefile
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
