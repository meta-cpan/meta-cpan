DESCRIPTION = ""List::Util" contains a selection of subroutines that people have expressed \
would be nice to have in the perl core, but the usage would not really be \
high enough to warrant the use of a keyword, and the size so small such \
that being individual extensions would be wasteful."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scalar-List-Utils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-1.44.tar.gz"

SRC_URI[md5sum] = "af7a1a53fe85b5858d08aa7e8a7e0965"
SRC_URI[sha256sum] = "5bab98156f875c3e8a55667e6b11147cdcb349e65bd19dad0ff36a41e4b4fa14"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
