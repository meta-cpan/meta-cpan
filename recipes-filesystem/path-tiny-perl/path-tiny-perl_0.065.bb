DESCRIPTION = "This module provide a small, fast utility for working with file paths. \
It is friendlier to use than File::Spec and provides easy access to functions \
from several other core file handling modules. It aims to be smaller and \
faster than many alternatives on CPAN while helping people do many common \
things in consistent and less error-prone ways."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Path-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-0.065.tar.gz"

SRC_URI[md5sum] = "d0cc4ebe40e639c5c2942fe3abb27fc8"
SRC_URI[sha256sum] = "8df248a1923b774e2528b7d867e3681015f7598bbef9ca22c5e1a689e0a19af5"
RRECOMMENDS_${PN} += "unicode-utf8-perl"
RECOMMENDS += "test-failwarnings-perl-native"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
