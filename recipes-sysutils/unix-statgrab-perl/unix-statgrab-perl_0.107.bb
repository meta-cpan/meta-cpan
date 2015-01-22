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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Unix-Statgrab-0.107.tar.gz"

SRC_URI[md5sum] = "001a5d472657ca01c34d65a11a769835"
SRC_URI[sha256sum] = "c5cc68690c31f8fea9b60bb6948b1afb4549aed55c238319e52dfdeb170cd828"
RRECOMMENDS_${PN} += "test-leaktrace-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "libstatgrab"
RDEPENDS_${PN} += "perl libstatgrab"

S = "${WORKDIR}/Unix-Statgrab-${PV}"

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
