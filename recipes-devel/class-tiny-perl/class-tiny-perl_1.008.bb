DESCRIPTION = "This module offers a minimalist class construction kit in around 120 lines \
of code. Here is a list of features:"

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Class-Tiny-1.008.tar.gz"

SRC_URI[md5sum] = "e3ccfae5f64d443e7e1110be964d7202"
SRC_URI[sha256sum] = "ee058a63912fa1fcb9a72498f56ca421a2056dc7f9f4b67837446d6421815615"
RECOMMENDS += "test-failwarnings-perl-native"

S = "${WORKDIR}/Class-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
