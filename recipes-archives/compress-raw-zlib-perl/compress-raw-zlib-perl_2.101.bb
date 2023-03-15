DESCRIPTION = "The *Compress::Raw::Zlib* module provides a Perl interface to the *zlib* \
compression library (see "AUTHOR" for details about where to get *zlib*)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Zlib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Zlib-2.101.tar.gz"

SRC_URI[md5sum] = "681e24fffbb32c1bde808be584489789"
SRC_URI[sha256sum] = "9d1b9515e8277c1b007e33fad1fd0f18717d56bf647e3794d61289c45b1aabb2"

DEPENDS += "zlib"

S = "${WORKDIR}/Compress-Raw-Zlib-${PV}"

inherit cpan

export BUILD_ZLIB="0"

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
