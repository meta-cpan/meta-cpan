DESCRIPTION = "Net::SSLeay module contains perl bindings to openssl \
(<http://www.openssl.org>) library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "zlib openssl"
RDEPENDS_${PN} += "zlib openssl"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKEM/Net-SSLeay-1.70.tar.gz"

SRC_URI[md5sum] = "511cc451a64b0c5051bd9167f37051a0"
SRC_URI[sha256sum] = "05eaaa29b8f67778040eee53150ba702fc0ce49420ddd0f1ca68d082f4ee9f4a"

S = "${WORKDIR}/Net-SSLeay-${PV}"

INSANE_SKIP_${PN} += "rpaths"

inherit cpan

do_configure() {
	export OPENSSL_PREFIX="${STAGING_DIR_TARGET}/usr"
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
