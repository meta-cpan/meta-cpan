DESCRIPTION = ""Moo\" is an extremely light-weight Object Orientation system. It \
allows one to concisely define objects and roles with a convenient syntax \
that avoids the details of Perl's object system. \"Moo\" contains a subset \
of Moose and is optimised for rapid startup."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Moo-2.000001.tar.gz"

SRC_URI[md5sum] = "61cfeb965736736e7c5687a28d097ac0"
SRC_URI[sha256sum] = "fa90b8806cde698581e25a25c69b08b8ee727bc320437281d43d859586323b4d"
RDEPENDS_${PN} += "class-method-modifiers-perl"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "strictures-perl"
RRECOMMENDS_${PN} += "class-xsaccessor-perl"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Moo-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
