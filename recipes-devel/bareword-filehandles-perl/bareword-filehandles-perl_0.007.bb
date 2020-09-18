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

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/bareword-filehandles-0.007.tar.gz"

SRC_URI[md5sum] = "c74088bd6971c8ec9754ea7492c16e48"
SRC_URI[sha256sum] = "4134533716d87af8fff56e250c488ad06df0a7bff48e7cf7de63ff6bc8d9c17f"
RDEPENDS_${PN} += "b-hooks-op-check-perl"
DEPENDS += "b-hooks-op-check-perl-native"
DEPENDS += "extutils-depends-perl-native"

S = "${WORKDIR}/bareword-filehandles-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
