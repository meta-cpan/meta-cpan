DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework \
for Perl. Dancer2 is a complete rewrite based on Moo."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Dancer2-0.160003.tar.gz"

SRC_URI[md5sum] = "44f8e0b10b26452dd02816ff667a8334"
SRC_URI[sha256sum] = "43373271bb560e4b8f30594c65160ddc6e6032f67a4fe5d17700ca1734a41ed5"
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
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-types-mooselike-perl"
RDEPENDS_${PN} += "plack-middleware-fixmissingbodyinredirect-perl"
RDEPENDS_${PN} += "plack-middleware-removeredundantbody-perl"
RDEPENDS_${PN} += "return-multilevel-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "safe-isa-perl"
RDEPENDS_${PN} += "template-tiny-perl"
RDEPENDS_${PN} += "template-toolkit-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN} += "yaml-perl"
RRECOMMENDS_${PN} += "cgi-deurl-xs-perl"
RRECOMMENDS_${PN} += "crypt-urandom-perl"
RRECOMMENDS_${PN} += "math-random-isaac-xs-perl"
RRECOMMENDS_${PN} += "scope-upper-perl"
RRECOMMENDS_${PN} += "url-encode-xs-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "http-message-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-memory-cycle-perl-native"
DEPENDS += "test-mocktime-perl-native"

S = "${WORKDIR}/Dancer2-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
