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

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/bareword-filehandles-0.006.tar.gz"

SRC_URI[md5sum] = "4d002caea4880ed63ae904c2750f509e"
SRC_URI[sha256sum] = "ad6c07c0bec2e4eb8d666bdb0d20943cbc68783bd1f3979dbf50bb3b2335bffb"
RDEPENDS_${PN} += "b-hooks-op-check-perl"
DEPENDS += "b-hooks-op-check-perl-native"
DEPENDS += "extutils-depends-perl-native"

S = "${WORKDIR}/bareword-filehandles-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
