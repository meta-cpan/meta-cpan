DESCRIPTION = "This module implements a secure way to encode session data. It is primarily \
intended for storing session data in browser cookies, but could be used \
with other backend storage where security of stored session data is \
important."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Session-Storage-Secure"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Session-Storage-Secure-1.000.tar.gz"

SRC_URI[md5sum] = "76d4022d46acadb69c7f6e1a611235cf"
SRC_URI[sha256sum] = "58b2f04eba56a9924494bb3eddd426affa75c3dded1c563f8296fcc13f8e666b"
RDEPENDS:${PN} += "crypt-cbc-perl"
RDEPENDS:${PN} += "crypt-rijndael-perl"
RDEPENDS:${PN} += "crypt-urandom-perl"
RDEPENDS:${PN} += "math-random-isaac-xs-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "moox-types-mooselike-perl"
RDEPENDS:${PN} += "namespace-clean-perl"
RDEPENDS:${PN} += "sereal-decoder-perl"
RDEPENDS:${PN} += "sereal-encoder-perl"
RDEPENDS:${PN} += "string-compare-constanttime-perl"
DEPENDS += "number-tolerant-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Session-Storage-Secure-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
