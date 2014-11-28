DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Charset"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEZUMI/MIME-Charset-1.011.2.tar.gz"

SRC_URI[md5sum] = "6afa05fc9f46c4951b2a7333049fb950"
SRC_URI[sha256sum] = "2e7c7e535753cf262095b1e2d9355b0d356fd3e90a9c602b6f59f7490903b760"

S = "${WORKDIR}/MIME-Charset-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
