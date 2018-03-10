DESCRIPTION = "Create a command line tool with your Moo, Moose objects."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Options"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Options-4.103.tar.gz"

SRC_URI[md5sum] = "498114d4831b6dfc49eb039fff6c2e0c"
SRC_URI[sha256sum] = "4df9d574f8f26db022bf06c1bda4708289451098c2e1563335df38d23b07326d"
RDEPENDS_${PN} += "getopt-long-descriptive-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-configfromfile-perl"
RDEPENDS_${PN} += "moox-locale-passthrough-perl"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "path-class-perl"
RDEPENDS_${PN} += "strictures-perl"
RDEPENDS_${PN} += "unicode-linebreak-perl"
RRECOMMENDS_${PN} += "data-record-perl"
RRECOMMENDS_${PN} += "json-maybexs-perl"
RRECOMMENDS_${PN} += "regexp-common-perl"
DEPENDS += "test-trap-perl-native"
RECOMMENDS += "data-record-perl-native"
RECOMMENDS += "json-maybexs-perl-native"
RECOMMENDS += "regexp-common-perl-native"

S = "${WORKDIR}/MooX-Options-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
