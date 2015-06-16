DESCRIPTION = "This module implements a secure way to encode session data. It is \
primarily intended for storing session data in browser cookies, but \
could be used with \
other backend storage where security of stored session data is \
important."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Session-Storage-Secure"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Session-Storage-Secure-0.010.tar.gz"

SRC_URI[md5sum] = "69cfb8796afeefbf4228810081b66863"
SRC_URI[sha256sum] = "3ef731772f7871bf4d5fe87387395c4b994345fc6268134b28978f82dde1c11f"
RDEPENDS_${PN} += "crypt-cbc-perl"
RDEPENDS_${PN} += "crypt-rijndael-perl"
RDEPENDS_${PN} += "crypt-urandom-perl"
RDEPENDS_${PN} += "math-random-isaac-xs-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-types-mooselike-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "sereal-decoder-perl"
RDEPENDS_${PN} += "sereal-encoder-perl"
RDEPENDS_${PN} += "string-compare-constanttime-perl"
DEPENDS += "number-tolerant-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Session-Storage-Secure-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
