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

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Moo-2.001001.tar.gz"

SRC_URI[md5sum] = "8daed3e18c927d72331c51cbeffda193"
SRC_URI[sha256sum] = "a68155b642f389cb1cc40139e2663d0c5d15eb71d9ecb0961623a73c10dd8ec0"
RDEPENDS_${PN} += "class-method-modifiers-perl"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RRECOMMENDS_${PN} += "class-xsaccessor-perl"
RRECOMMENDS_${PN} += "strictures-perl"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Moo-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
