DESCRIPTION = "This module implements a session factory for Dancer 2 that stores \
session state within a browser cookie. Features include:"

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Session-Cookie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/Y/YA/YANICK/Dancer2-Session-Cookie-0.006.tar.gz"

SRC_URI[md5sum] = "a068ae15f2a9bf824b4f74fba8147a18"
SRC_URI[sha256sum] = "5bdd20e1b59630051db91abefa75c2ef3f2097a83986ca1cfa337ed7c9eabf41"
RDEPENDS_${PN} += "dancer2-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "session-storage-secure-perl"
DEPENDS += "http-date-perl-native"
DEPENDS += "libwww-perl-perl-native"
DEPENDS += "test-tcp-perl-native"
DEPENDS += "yaml-perl-native"

S = "${WORKDIR}/Dancer2-Session-Cookie-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
