DESCRIPTION = "This documents the internals of the Type::Tiny class. Type::Tiny::Manual is \
a better starting place if you're new."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-1.010006.tar.gz"

SRC_URI[md5sum] = "b56b6d578843f509100f49b6ffddc21e"
SRC_URI[sha256sum] = "f1568e3f0bf103e65faadc1804c6184fe29bf52559e7ff3c12f4dad437befd82"
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
