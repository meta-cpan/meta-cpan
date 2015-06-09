DESCRIPTION = ""List::Util\" contains a selection of subroutines that people have \
expressed would be nice to have in the perl core, but the usage would \
not really be \
high enough to warrant the use of a keyword, and the size so small such \
that \
being individual extensions would be wasteful."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scalar-List-Utils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-1.42.tar.gz"

SRC_URI[md5sum] = "a76768c6e0f92eefb6d4b3b779469c3d"
SRC_URI[sha256sum] = "3507f72541f66a2dce850b9b56771e5fccda3d215c52f74946c6e370c0f4a4da"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
