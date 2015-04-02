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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-0.068.tar.gz"

SRC_URI[md5sum] = "76e99fd1bb615f56954025ae636c6233"
SRC_URI[sha256sum] = "a331fbd855a6216877c643c4cae4bf7edfdf7e13cd8142d2cb2d12eafdebaee0"
RRECOMMENDS_${PN} += "unicode-utf8-perl"
RECOMMENDS += "test-failwarnings-perl-native"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
