DESCRIPTION = "This module implements an interface to the Linux 2.6.13 and later Inotify \
file/directory change notification system."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Linux-Inotify2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/Linux-Inotify2-1.22.tar.gz"

SRC_URI[md5sum] = "bc0a86f04476f9e0aaab026b8081f097"
SRC_URI[sha256sum] = "bc9d253f4079935a78b9c071721a5da5c4cb51fb79874e7a28cc4cd5d13521d1"
RDEPENDS_${PN} += "common-sense-perl"

S = "${WORKDIR}/Linux-Inotify2-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
