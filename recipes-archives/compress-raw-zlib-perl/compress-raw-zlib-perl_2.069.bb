DESCRIPTION = "The Compress::Raw::Zlib module provides a Perl interface to the \
zlib compression library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Zlib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Zlib-2.069.tar.gz"

SRC_URI[md5sum] = "c1f99178e6e29b0037785afa6d8bbcff"
SRC_URI[sha256sum] = "9a647fe7d2e6122370372a11c1e3a2e2b54c90bba595cad170854fdaa8a64619"

S = "${WORKDIR}/Compress-Raw-Zlib-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
