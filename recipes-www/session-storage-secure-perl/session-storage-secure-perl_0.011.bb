DESCRIPTION = "This module implements a secure way to encode session data. It is primarily \
intended for storing session data in browser cookies, but could be used \
with other backend storage where security of stored session data is \
important."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Session-Storage-Secure"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Session-Storage-Secure-0.011.tar.gz"

SRC_URI[md5sum] = "fd320579bec6e64cd41a8114d36855c0"
SRC_URI[sha256sum] = "19c99e9ca3eec3159704171838cb69b85cdff885d30f9536fe4be3034cf1c097"
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

inherit cpan allarch

BBCLASSEXTEND = "native"
