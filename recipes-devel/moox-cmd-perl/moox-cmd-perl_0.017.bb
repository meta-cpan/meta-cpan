DESCRIPTION = "Eases the writing of command line utilities, accepting commands and \
subcommands and so on. These commands can form a tree, which is mirrored in \
the package structure. On invocation each command along the path through \
the tree (starting from the toplevel command through to the most specific \
one) is instanciated."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Cmd-0.017.tar.gz"

SRC_URI[md5sum] = "51463dcc80fef5bf827392ddfb8ee3ca"
SRC_URI[sha256sum] = "943ff28daa80897327c7c5fec5a7100cfaac92daf0f9f97c38e3a77d00ae70f5"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "regexp-common-perl"
RRECOMMENDS_${PN} += "hash-merge-perl"
RRECOMMENDS_${PN} += "moox-configfromfile-perl"
DEPENDS += "capture-tiny-perl-native"

S = "${WORKDIR}/MooX-Cmd-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
