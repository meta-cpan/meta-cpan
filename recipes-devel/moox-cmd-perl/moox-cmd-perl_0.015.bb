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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Cmd-0.015.tar.gz"

SRC_URI[md5sum] = "cef328aaec48414a399a9d2a4380fbc5"
SRC_URI[sha256sum] = "5569bb60f722caa4e23ac5d4aab0c0f62f138ee426e92bd05bda30bb91828504"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "regexp-common-perl"
DEPENDS += "capture-tiny-perl-native"

S = "${WORKDIR}/MooX-Cmd-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
