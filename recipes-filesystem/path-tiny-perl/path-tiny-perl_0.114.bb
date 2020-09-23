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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-0.114.tar.gz"

SRC_URI[md5sum] = "dd6092293f8766fb87d003dceebe4263"
SRC_URI[sha256sum] = "cd0f88f37a58fc3667ec065767fe01e73ee6efa18a112bfd3508cf6579ca00e1"
RRECOMMENDS_${PN} += "unicode-utf8-perl"
RECOMMENDS += "test-failwarnings-perl-native"
RECOMMENDS += "test-mockrandom-perl-native"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
