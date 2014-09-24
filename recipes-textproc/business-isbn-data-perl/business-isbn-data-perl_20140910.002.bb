DESCRIPTION = "You don't need to load this module yourself in most cases. \
\"Business::ISBN\" will load it when it loads."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN-Data"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-Data-20140910.002.tar.gz"

SRC_URI[md5sum] = "448104360420c530fbd88ad125a6be54"
SRC_URI[sha256sum] = "3e2413d6672f6cbbfad61caa2d6eb315382bb5bc09db5157c8107cbdc98ecbae"

S = "${WORKDIR}/Business-ISBN-Data-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
