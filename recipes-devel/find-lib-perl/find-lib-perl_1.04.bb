DESCRIPTION = "The purpose of this module is to replace"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Find-Lib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/Y/YA/YANNK/Find-Lib-1.04.tar.gz"

SRC_URI[md5sum] = "bf5619b4ba1945320eccef69b028c453"
SRC_URI[sha256sum] = "1d73921e3061e1b046fe4268e2d05ffd5a4c5762666e2e4723f83aacc146e851"

S = "${WORKDIR}/Find-Lib-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
