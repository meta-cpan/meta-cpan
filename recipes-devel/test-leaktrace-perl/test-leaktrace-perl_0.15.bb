DESCRIPTION = ""Test::LeakTrace\" provides several functions that trace memory leaks. \
This module scans arenas, the memory allocation system, so it can \
detect any \
leaked SVs in given blocks."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-LeakTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GF/GFUJI/Test-LeakTrace-0.15.tar.gz"

SRC_URI[md5sum] = "5eac99e7882970f41886c3e0cec185d8"
SRC_URI[sha256sum] = "efb8b58b6981efc6c9c4b4a3b550728f8c179f3c8d57c05724873011c08de65e"

S = "${WORKDIR}/Test-LeakTrace-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
