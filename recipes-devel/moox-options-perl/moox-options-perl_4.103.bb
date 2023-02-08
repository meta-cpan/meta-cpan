DESCRIPTION = "Create a command line tool with your Moo, Moose objects."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Options"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Options-4.103.tar.gz"

SRC_URI[md5sum] = "498114d4831b6dfc49eb039fff6c2e0c"
SRC_URI[sha256sum] = "4df9d574f8f26db022bf06c1bda4708289451098c2e1563335df38d23b07326d"
RDEPENDS:${PN} += "getopt-long-descriptive-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "moox-locale-passthrough-perl"
RDEPENDS:${PN} += "mro-compat-perl"
RDEPENDS:${PN} += "path-class-perl"
RDEPENDS:${PN} += "strictures-perl"
RDEPENDS:${PN} += "unicode-linebreak-perl"
RRECOMMENDS:${PN} += "data-record-perl"
RRECOMMENDS:${PN} += "json-maybexs-perl"
RRECOMMENDS:${PN} += "regexp-common-perl"
DEPENDS += "test-trap-perl-native"
RECOMMENDS += "data-record-perl-native"
RECOMMENDS += "json-maybexs-perl-native"
RECOMMENDS += "regexp-common-perl-native"

S = "${WORKDIR}/MooX-Options-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
