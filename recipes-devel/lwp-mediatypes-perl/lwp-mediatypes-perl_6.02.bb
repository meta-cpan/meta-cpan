DESCRIPTION = "This module provides functions for handling media (also known as MIME) \
types and encodings. The mapping from file extensions to media types is \
defined by \
the media.types file. If the ~/.media.types file exists it is used \
instead. \
For backwards compatibility we will also look for ~/.mime.types."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-MediaTypes"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/LWP-MediaTypes-6.02.tar.gz"

SRC_URI[md5sum] = "8c5f25fb64b974d22aff424476ba13c9"
SRC_URI[sha256sum] = "18790b0cc5f0a51468495c3847b16738f785a2d460403595001e0b932e5db676"

S = "${WORKDIR}/LWP-MediaTypes-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
