DESCRIPTION = "List::MoreUtils provides some trivial but commonly needed functionality on \
lists which is not going to go into List::Util."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-0.428.tar.gz"

SRC_URI[md5sum] = "493032a211cdff1fcf45f59ebd680407"
SRC_URI[sha256sum] = "713e0945d5f16e62d81d5f3da2b6a7b14a4ce439f6d3a7de74df1fd166476cc2"
RRECOMMENDS_${PN} += "list-moreutils-xs-perl"
RDEPENDS_${PN} += "exporter-tiny-perl"
RECOMMENDS += "config-autoconf-perl-native"
RECOMMENDS += "inc-latest-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
