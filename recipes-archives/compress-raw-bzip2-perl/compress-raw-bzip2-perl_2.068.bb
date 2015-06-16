DESCRIPTION = ""Compress::Raw::Bzip2\" provides an interface to the in-memory \
compression/uncompression functions from the bzip2 compression library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Bzip2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Bzip2-2.068.tar.gz"

SRC_URI[md5sum] = "3a8368a3254bbdfca9eaf30788b54342"
SRC_URI[sha256sum] = "0f63f9e0a2d10e960714c8e0b9f99f5edd576868d1b75fc06f74b27b3b2a149a"
DEPENDS = "bzip2 perl"
#RDEPENDS_${PN} += "libbz2"

S = "${WORKDIR}/Compress-Raw-Bzip2-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
