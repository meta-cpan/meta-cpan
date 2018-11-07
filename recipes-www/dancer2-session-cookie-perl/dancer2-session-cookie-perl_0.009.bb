DESCRIPTION = "This module implements a session factory for Dancer 2 that stores session \
state within a browser cookie. Features include:"

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Session-Cookie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YA/YANICK/Dancer2-Session-Cookie-0.009.tar.gz"

SRC_URI[md5sum] = "4a1d2c83f8d539223afdbe75d86efdd6"
SRC_URI[sha256sum] = "aef2755db550d22652e145d67459916c83883848b9359d6f03ad5981f26c2826"
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
