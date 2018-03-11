DESCRIPTION = "This module implements a session factory for Dancer 2 that stores session \
state within a browser cookie. Features include:"

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Session-Cookie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YA/YANICK/Dancer2-Session-Cookie-0.008.tar.gz"

SRC_URI[md5sum] = "8df8e1f3ed4b07e046832d9ff7e04b0f"
SRC_URI[sha256sum] = "67ac3d9da3828514f76ff6fabff8b1f80ca2c0c130c4ed7e2fd6ccc7c99ddf1a"
RDEPENDS_${PN} += "dancer2-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "session-storage-secure-perl"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "http-message-perl-native"
DEPENDS += "plack-perl-native"
DEPENDS += "test-mockobject-perl-native"
DEPENDS += "yaml-perl-native"

S = "${WORKDIR}/Dancer2-Session-Cookie-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
