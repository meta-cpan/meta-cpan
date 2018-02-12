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

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GARU/Clone-0.39.tar.gz"

SRC_URI[md5sum] = "c7ac45d1023536bd05796e2a391188ac"
SRC_URI[sha256sum] = "acb046683e49d650b113634ecf57df000816a49e611b0fff70bf3f93568bfa2d"

S = "${WORKDIR}/Clone-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
