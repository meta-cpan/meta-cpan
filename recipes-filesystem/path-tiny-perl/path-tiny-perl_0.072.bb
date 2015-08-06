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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-0.072.tar.gz"

SRC_URI[md5sum] = "840696b295230682c727297c87fe42d6"
SRC_URI[sha256sum] = "d7507c7822d4f7f60a5329d26c8afce31022cd92d02b011e367cc6a1eeae6981"
RRECOMMENDS_${PN} += "unicode-utf8-perl"
RECOMMENDS += "test-failwarnings-perl-native"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
