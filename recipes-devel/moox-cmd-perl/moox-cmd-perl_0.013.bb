DESCRIPTION = "Eases the writing of command line utilities, accepting commands \
and subcommands and so on. These commands can form a tree, which is mirrored \
in the package structure. On invocation each command along the path through \
the tree (starting from the toplevel command through to the most specific \
one) is instanciated."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Cmd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Cmd-0.013.tar.gz"

SRC_URI[md5sum] = "52352d6c275ada3ba30d58ee384d5c3c"
SRC_URI[sha256sum] = "dec801693bfbd66a867f9e95edcccd90874cc8905ceff5bbe729ff56dd45ddbf"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "regexp-common-perl"
DEPENDS += "io-tiecombine-perl-native"

S = "${WORKDIR}/MooX-Cmd-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
