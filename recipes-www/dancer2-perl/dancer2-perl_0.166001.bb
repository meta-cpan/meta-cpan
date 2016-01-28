DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework for \
Perl. Dancer2 is a complete rewrite based on Moo."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Dancer2-0.166001.tar.gz"

SRC_URI[md5sum] = "9c144136d3c712f69cbaca4f04269ea6"
SRC_URI[sha256sum] = "06c79cd3cc7d9367790fb73203778c24840c3b658626ee42e75478a6534695a4"
RDEPENDS_${PN} += "app-cmd-perl"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "config-any-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "hash-merge-simple-perl"
RDEPENDS_${PN} += "http-body-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-headers-fast-perl"
RDEPENDS_${PN} += "import-into-perl"
RDEPENDS_${PN} += "json-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-types-mooselike-perl"
RDEPENDS_${PN} += "plack-middleware-fixmissingbodyinredirect-perl"
RDEPENDS_${PN} += "plack-middleware-removeredundantbody-perl"
RDEPENDS_${PN} += "plack-perl"
RDEPENDS_${PN} += "return-multilevel-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "safe-isa-perl"
RDEPENDS_${PN} += "template-tiny-perl"
RDEPENDS_${PN} += "uri-perl"
RRECOMMENDS_${PN} += "class-load-xs-perl"
RRECOMMENDS_${PN} += "cgi-deurl-xs-perl"
RRECOMMENDS_${PN} += "crypt-urandom-perl"
RRECOMMENDS_${PN} += "math-random-isaac-xs-perl"
RRECOMMENDS_${PN} += "scope-upper-perl"
RRECOMMENDS_${PN} += "url-encode-xs-perl"
RRECOMMENDS_${PN} += "yaml-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "http-message-perl-native"
DEPENDS += "template-toolkit-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "yaml-perl-native"

S = "${WORKDIR}/Dancer2-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
