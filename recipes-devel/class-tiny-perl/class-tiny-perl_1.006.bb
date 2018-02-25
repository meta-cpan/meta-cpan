DESCRIPTION = "This module offers a minimalist class construction kit in around 120 lines \
of code. Here is a list of features:"

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Class-Tiny-1.006.tar.gz"

SRC_URI[md5sum] = "fa905646a85a1478b2db1fc9113cb6ac"
SRC_URI[sha256sum] = "2efcbd31528be51d3022c616768558b78c6172df5f03c5dc698939f65488cb4e"
RECOMMENDS += "test-failwarnings-perl-native"

S = "${WORKDIR}/Class-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
