DESCRIPTION = "List::MoreUtils provides some trivial but commonly needed functionality on \
lists which is not going to go into List::Util."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-0.430.tar.gz"

SRC_URI[md5sum] = "daccd6310021231b827dcc943ff1c6b7"
SRC_URI[sha256sum] = "63b1f7842cd42d9b538d1e34e0330de5ff1559e4c2737342506418276f646527"
RDEPENDS:${PN} += "exporter-tiny-perl"
RDEPENDS:${PN} += "list-moreutils-xs-perl"
DEPENDS += "test-leaktrace-perl-native"
RECOMMENDS += "config-autoconf-perl-native"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
