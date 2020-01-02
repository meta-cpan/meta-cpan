DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported. All functions throw exceptions on \
errors, write functions don't return any meaningful value."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Slurper"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/File-Slurper-0.012.tar.gz"

SRC_URI[md5sum] = "5742c63096392dfee50b8db314bcca18"
SRC_URI[sha256sum] = "4efb2ea416b110a1bda6f8133549cc6ea3676402e3caf7529fce0313250aa578"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/File-Slurper-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
