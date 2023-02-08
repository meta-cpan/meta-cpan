DESCRIPTION = ""Moo" is an extremely light-weight Object Orientation system. It allows one \
to concisely define objects and roles with a convenient syntax that avoids \
the details of Perl's object system. "Moo" contains a subset of Moose and \
is optimised for rapid startup."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Moo-2.005004.tar.gz"

SRC_URI[md5sum] = "49ecf491b49b9b200e8a5dfd1a42b480"
SRC_URI[sha256sum] = "e3030b80bd554a66f6b3c27fd53b1b5909d12af05c4c11ece9a58f8d1e478928"
RDEPENDS:${PN} += "class-method-modifiers-perl"
RDEPENDS:${PN} += "role-tiny-perl"
RDEPENDS:${PN} += "sub-quote-perl"
RRECOMMENDS:${PN} += "class-xsaccessor-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Moo-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
