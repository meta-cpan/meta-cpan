DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Charset"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/N/NE/NEZUMI/MIME-Charset-1.011.1.tar.gz"

SRC_URI[md5sum] = "1cc1d7f650ea9c6906a63a471b001741"
SRC_URI[sha256sum] = "2955a3b617fe12654efc2a13ae1dc7d32aad81d35cfae21f74337213cf2435d5"

S = "${WORKDIR}/MIME-Charset-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
