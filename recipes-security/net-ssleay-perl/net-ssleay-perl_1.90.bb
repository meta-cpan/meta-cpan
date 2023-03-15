DESCRIPTION = "This module provides Perl bindings for libssl (an SSL/TLS API) and \
libcrypto (a cryptography API)."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHRISN/Net-SSLeay-1.90.tar.gz \
	   file://0001-Makefile.PL-avoid-execution-of-openssl.patch \
"

SRC_URI[md5sum] = "00f57f3feb02e4fb7d282f9d6ae2beb2"
SRC_URI[sha256sum] = "f8696cfaca98234679efeedc288a9398fcf77176f1f515dbc589ada7c650dc93"
DEPENDS = "zlib openssl"

S = "${WORKDIR}/Net-SSLeay-${PV}"

inherit cpan

do_configure() {
	export OPENSSL_PREFIX="${STAGING_EXECPREFIXDIR}"
	cpan_do_configure
}

BBCLASSEXTEND = "native"
