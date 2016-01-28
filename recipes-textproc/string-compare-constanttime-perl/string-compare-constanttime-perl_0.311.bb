DESCRIPTION = "This module provides one function, "equals" (not exported by default)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Compare-ConstantTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/F/FR/FRACTAL/String-Compare-ConstantTime-0.311.tar.gz"

SRC_URI[md5sum] = "1e8e66dd8a1c034fbaa05147b9da2cb0"
SRC_URI[sha256sum] = "2f2d0fee30e1b3fb3b20f3bdefd0aafe54946e8f0f9410ae07a0931cce9c9a8d"

S = "${WORKDIR}/String-Compare-ConstantTime-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
