DESCRIPTION = "The LWP::Protocol::https module provides support for using https \
schemed URLs with LWP. This module is a plug-in to the LWP protocol \
handling, so you \
don't use it directly. Once the module is installed LWP is able to \
access \
sites using HTTP over SSL/TLS."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-Protocol-https"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "io-socket-ssl-perl"
DEPENDS += "libwww-perl-perl"
DEPENDS += "mozilla-ca-perl"
DEPENDS += "net-http-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/LWP-Protocol-https-6.04.tar.gz"

SRC_URI[md5sum] = "1b422a7d3b5fed1eb4d748fdc9fd79a4"
SRC_URI[sha256sum] = "1ef67750ee363525cf729b59afde805ac4dc80eaf8d36ca01082a4d78a7af629"

S = "${WORKDIR}/LWP-Protocol-https-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
