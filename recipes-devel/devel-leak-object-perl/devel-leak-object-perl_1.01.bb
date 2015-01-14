DESCRIPTION = "This module provides tracking of objects, for the purpose of detecting \
memory leaks due to circular references or innappropriate caching \
schemes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Leak-Object"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Devel-Leak-Object-1.01.tar.gz"

SRC_URI[md5sum] = "f3b74a603e55d63e391750c2a10928f5"
SRC_URI[sha256sum] = "20b23ca7817b9a7cb44944b9e99b2d2627087b386a108b432a0064c0f2703a88"

S = "${WORKDIR}/Devel-Leak-Object-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
