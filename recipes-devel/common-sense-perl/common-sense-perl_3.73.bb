DESCRIPTION = "Nothing is more fairly distributed than common sense: no one \
thinks he needs more of it than he already has."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/common-sense"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/common-sense-3.73.tar.gz"

SRC_URI[md5sum] = "6da7455a43ab60ed21c2a5e3b3ddeda8"
SRC_URI[sha256sum] = "8110c5e472641e0c218f8e023cecc1612ef66f9a1b313261fe219862efe3fd10"

S = "${WORKDIR}/common-sense-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
