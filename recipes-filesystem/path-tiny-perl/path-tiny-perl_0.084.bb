DESCRIPTION = "This module provides a small, fast utility for working with file paths. It \
is friendlier to use than File::Spec and provides easy access to functions \
from several other core file handling modules. It aims to be smaller and \
faster than many alternatives on CPAN, while helping people do many common \
things in consistent and less error-prone ways."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Path-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-0.084.tar.gz"

SRC_URI[md5sum] = "91de357ef60ba1a86b1c68b6064321a9"
SRC_URI[sha256sum] = "633f463e380404d4aaa8ebdd1977b5e387256aa2770eb142b169737978749bea"
RRECOMMENDS_${PN} += "unicode-utf8-perl"
RECOMMENDS += "test-failwarnings-perl-native"
RECOMMENDS += "test-mockrandom-perl-native"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
