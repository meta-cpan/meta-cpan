DESCRIPTION = "The *Compress::Raw::Zlib* module provides a Perl interface to the *zlib* \
compression library (see "AUTHOR" for details about where to get *zlib*)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Zlib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Zlib-2.076.tar.gz"

SRC_URI[md5sum] = "9571af6b16279ed049b5a07a679e5797"
SRC_URI[sha256sum] = "361e4ec3c43ea6fe51fc6687d1bae61a49a28a7709b0e2686df4ea6a228082aa"

S = "${WORKDIR}/Compress-Raw-Zlib-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
