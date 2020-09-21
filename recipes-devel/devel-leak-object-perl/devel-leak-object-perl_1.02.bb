DESCRIPTION = "This module provides tracking of objects, for the purpose of detecting \
memory leaks due to circular references or inappropriate caching schemes."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Leak-Object"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Devel-Leak-Object-1.02.tar.gz"

SRC_URI[md5sum] = "69c53688ebf58a708c806147bb8af318"
SRC_URI[sha256sum] = "4d5226800b72fb64351767a524e811205f5c66623979b2bd7199abd7fac505ee"

S = "${WORKDIR}/Devel-Leak-Object-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
