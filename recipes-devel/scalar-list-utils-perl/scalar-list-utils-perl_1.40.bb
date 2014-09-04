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

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-1.40.tar.gz"

SRC_URI[md5sum] = "8f15044070c35ae723ef18078c72344b"
SRC_URI[sha256sum] = "cb1bababbb02e782f1883c3950097ad2a4639e092ae277c1ed16cc9fb11ac66a"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
