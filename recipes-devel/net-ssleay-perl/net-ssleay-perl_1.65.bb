DESCRIPTION = "Net::SSLeay module contains perl bindings to openssl \
(<http://www.openssl.org>) library."

SECTION = "libs"
LICENSE = "OpenSSL"
PR = "r0"

DEPENDS= "zlib openssl"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/OpenSSL;md5=4eb1764f3e65fafa1a25057f9082f2ae"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIKEM/Net-SSLeay-1.65.tar.gz"

SRC_URI[md5sum] = "19600c036e9e0bbfbf9157f083e40755"
SRC_URI[sha256sum] = "2fb1371120b85f018944d95736c107163f04ba56b6029c0709a2c3d6247b9c06"

S = "${WORKDIR}/Net-SSLeay-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
