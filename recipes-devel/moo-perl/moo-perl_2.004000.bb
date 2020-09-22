DESCRIPTION = ""Moo" is an extremely light-weight Object Orientation system. It allows one \
to concisely define objects and roles with a convenient syntax that avoids \
the details of Perl's object system. "Moo" contains a subset of Moose and \
is optimised for rapid startup."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Moo-2.004000.tar.gz"

SRC_URI[md5sum] = "e542104553d616b15631b5c66ccee904"
SRC_URI[sha256sum] = "323240d000394cf38ec42e865b05cb8928f625c82c9391cd2cdc72b33c51b834"
RDEPENDS_${PN} += "class-method-modifiers-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "sub-quote-perl"
RRECOMMENDS_${PN} += "class-xsaccessor-perl"
RRECOMMENDS_${PN} += "strictures-perl"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Moo-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
