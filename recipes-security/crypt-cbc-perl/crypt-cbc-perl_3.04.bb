DESCRIPTION = "This module is a Perl-only implementation of the cryptographic cipher block \
chaining mode (CBC). In combination with a block cipher such as AES or \
Blowfish, you can encrypt and decrypt messages of arbitrarily long length. \
The encrypted messages are compatible with the encryption format used by \
the OpenSSL package."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-CBC"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LD/LDS/Crypt-CBC-3.04.tar.gz"

SRC_URI[md5sum] = "46c9674f6d787037ed564c078a15bdfd"
SRC_URI[sha256sum] = "4026c57d0dbf6496c0d561a26f161b763d3b8edf351139c073492e21b5fbce07"
RDEPENDS:${PN} += "crypt-pbkdf2-perl"
RDEPENDS:${PN} += "cryptx-perl"

S = "${WORKDIR}/Crypt-CBC-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
