DESCRIPTION = "Type::Tiny is a tiny class for creating Moose-like type constraint objects \
which are compatible with Moo, Moose and Mouse."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-1.004002.tar.gz"

SRC_URI[md5sum] = "fad12549fe5b904173e18a05e82e5166"
SRC_URI[sha256sum] = "e52c7e9593052aed157a15d473b5c25a1dbb3454bf3cd6913df94cc9bb2be707"
RDEPENDS_${PN} += "exporter-tiny-perl"
RRECOMMENDS_${PN} += "devel-lexalias-perl"
RRECOMMENDS_${PN} += "devel-stacktrace-perl"
RRECOMMENDS_${PN} += "ref-util-xs-perl"
RRECOMMENDS_${PN} += "regexp-util-perl"
RRECOMMENDS_${PN} += "scalar-list-utils-perl"
RRECOMMENDS_${PN} += "type-tie-perl"
RRECOMMENDS_${PN} += "type-tiny-xs-perl"
RECOMMENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Type-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
