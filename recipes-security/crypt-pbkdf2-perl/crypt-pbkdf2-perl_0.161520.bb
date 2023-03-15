DESCRIPTION = "PBKDF2 is a secure password hashing algorithm that uses the techniques of \
"key strengthening" to make the complexity of a brute-force attack \
arbitrarily high. PBKDF2 uses any other cryptographic hash or cipher (by \
convention, usually HMAC-SHA1, but "Crypt::PBKDF2" is fully pluggable), and \
allows for an arbitrary number of iterations of the hashing function, and a \
nearly unlimited output hash size (up to 2**32 - 1 times the size of the \
output of the backend hash). The hash is salted, as any password hash \
should be, and the salt may also be of arbitrary size."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-PBKDF2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARODLAND/Crypt-PBKDF2-0.161520.tar.gz"

SRC_URI[md5sum] = "7a0c8f86ea606125971c36e1b9e21a74"
SRC_URI[sha256sum] = "97dfa79a309a086e184a4e61047f8a10ffb3db051025e7d222a25f19130ba417"
RDEPENDS:${PN} += "digest-hmac-perl"
RDEPENDS:${PN} += "digest-sha3-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "namespace-autoclean-perl"
RDEPENDS:${PN} += "strictures-perl"
RDEPENDS:${PN} += "try-tiny-perl"
RDEPENDS:${PN} += "type-tiny-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Crypt-PBKDF2-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
