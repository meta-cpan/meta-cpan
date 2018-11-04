DESCRIPTION = "This module provides a "clone()" method which makes recursive copies of \
nested hash, array, scalar and reference types, including tied variables \
and objects."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Clone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GARU/Clone-0.41.tar.gz"

SRC_URI[md5sum] = "4556ca17794f545444836e4d22d443fd"
SRC_URI[sha256sum] = "e8c056dcf4bc8889079a09412af70194a54a269689ba72edcd91291a46a51518"

S = "${WORKDIR}/Clone-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
