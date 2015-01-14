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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Unix-Statgrab-0.106.tar.gz"

SRC_URI[md5sum] = "c42d2c96cf966dc02eecd86e27617b50"
SRC_URI[sha256sum] = "a0a64a9cfe4b07019d096eb5b9d5e605c49a256243864f5c1faa3420939edbfe"
RRECOMMENDS_${PN} += "test-leaktrace-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "extutils-makemaker-perl-native"
RDEPENDS_${PN} += "perl libstatgrab"

S = "${WORKDIR}/Unix-Statgrab-${PV}"

inherit cpan pkgconfig

do_configure() {
        export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
        cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}


BBCLASSEXTEND = "native"
