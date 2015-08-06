DESCRIPTION = "This module provides functions for fast and correct slurping and \
spewing. All functions are optionally exported."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Slurp-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/File-Slurp-Tiny-0.004.tar.gz"

SRC_URI[md5sum] = "7575b81543281ea57cdb7e5eb3f73264"
SRC_URI[sha256sum] = "452995beeabf0e923e65fdc627a725dbb12c9e10c00d8018c16d10ba62757f1e"

S = "${WORKDIR}/File-Slurp-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
