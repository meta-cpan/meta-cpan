DESCRIPTION = "This module lexically disables the use of bareword filehandles with builtin \
functions, except for the special builtin filehandles "STDIN", "STDOUT", \
"STDERR", "ARGV", "ARGVOUT" and "DATA"."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/bareword-filehandles"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/bareword-filehandles-0.005.tar.gz"

SRC_URI[md5sum] = "274a7aabfab579b1f1c52775b9113325"
SRC_URI[sha256sum] = "66ab8cf4118187c2abc8178389007cd0f836702aff7fbaab37edbc2b34cdb139"
DEPENDS += "b-hooks-op-check-perl-native"
RDEPENDS_${PN} += "b-hooks-op-check-perl"
RDEPENDS_${PN} += "lexical-sealrequirehints-perl"
DEPENDS += "extutils-depends-perl-native"

S = "${WORKDIR}/bareword-filehandles-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
