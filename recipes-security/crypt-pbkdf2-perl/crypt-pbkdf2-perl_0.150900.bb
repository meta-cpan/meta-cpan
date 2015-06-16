DESCRIPTION = "PBKDF2 is a secure password hashing algorithm that uses the techniques \
of \"key strengthening\" to make the complexity of a brute-force attack \
arbitrarily high. PBKDF2 uses any other cryptographic hash or cipher \
(by \
convention, usually HMAC-SHA1, but \"Crypt::PBKDF2\" is fully \
pluggable), and \
allows for an arbitrary number of iterations of the hashing function, \
and a \
nearly unlimited output hash size (up to 2**32 - 1 times the size of \
the \
output of the backend hash). The hash is salted, as any password hash \
should \
be, and the salt may also be of arbitrary size."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-PBKDF2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARODLAND/Crypt-PBKDF2-0.150900.tar.gz"

SRC_URI[md5sum] = "b616ad383b5d9ea9bb8bde4ea0602f71"
SRC_URI[sha256sum] = "da2523bcec700918ebd62347297318582b99463c12a8c6f4c9eae4b01e7861bf"
RDEPENDS_${PN} += "digest-hmac-perl"
RDEPENDS_${PN} += "digest-sha3-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moose-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Crypt-PBKDF2-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
