DESCRIPTION = ""Compress::Raw::Lzma" provides an interface to the in-memory \
compression/uncompression functions from the lzma compression library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Lzma"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Lzma-2.101.tar.gz"

SRC_URI[md5sum] = "7ba205e1761e0feb6a1efed0899a6b2b"
SRC_URI[sha256sum] = "bb267fd31981eda11f444038f8a0fca4b94a51ae61b2db71246abf6a4d322a36"

DEPENDS += "xz"

S = "${WORKDIR}/Compress-Raw-Lzma-${PV}"

inherit cpan

export LIBLZMA_INCLUDE="-I${STAGING_DIR_HOST}${includedir}"
export LIBLZMA_LIB="-I${STAGING_DIR_HOST}${libdir}"

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
