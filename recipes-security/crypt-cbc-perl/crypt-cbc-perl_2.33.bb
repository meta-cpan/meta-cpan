DESCRIPTION = "This module is a Perl-only implementation of the cryptographic cipher \
block chaining mode (CBC). In combination with a block cipher such as \
DES or IDEA, \
you can encrypt and decrypt messages of arbitrarily long length. The \
encrypted messages are compatible with the encryption format used by \
the \
OpenSSL package."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-CBC"

LIC_FILES_CHKSUM = "unknown(unknown)"

SRC_URI = "http://cpan.metacpan.org/authors/id/L/LD/LDS/Crypt-CBC-2.33.tar.gz"

SRC_URI[md5sum] = "3db5117d60df67e3b400fe367e716be0"
SRC_URI[sha256sum] = "6a70de21b6cc7f2b100067e8e188db966e9a8001b5db6fa976e7cb5b294ae645"

S = "${WORKDIR}/Crypt-CBC-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
