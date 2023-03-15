DESCRIPTION = "This documents the internals of the Type::Tiny class. Type::Tiny::Manual is \
a better starting place if you're new."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-1.012004.tar.gz"

SRC_URI[md5sum] = "7a1688c4de07a0ed481a1811e5e82e63"
SRC_URI[sha256sum] = "75cd06b612d1830ae9f4b22298b506b3ff04518fa7453f487c248cd62a906a2b"
RDEPENDS:${PN} += "exporter-tiny-perl"
RRECOMMENDS:${PN} += "devel-lexalias-perl"
RRECOMMENDS:${PN} += "devel-stacktrace-perl"
RRECOMMENDS:${PN} += "ref-util-xs-perl"
RRECOMMENDS:${PN} += "regexp-util-perl"
RRECOMMENDS:${PN} += "type-tie-perl"
RRECOMMENDS:${PN} += "type-tiny-xs-perl"
RECOMMENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Type-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
