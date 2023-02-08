DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework for \
Perl. Dancer2 is a complete rewrite based on Moo."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CR/CROMEDOME/Dancer2-0.301004.tar.gz"

SRC_URI[md5sum] = "72bf328925bab60a99b98358913f32a1"
SRC_URI[sha256sum] = "08ee0d9efbcc1a1a2059da5a1b99041eca8acee33b14e3d0b4cbbd010009dde5"
RDEPENDS:${PN} += "cli-osprey-perl"
RDEPENDS:${PN} += "clone-perl"
RDEPENDS:${PN} += "config-any-perl"
RDEPENDS:${PN} += "exporter-tiny-perl"
RDEPENDS:${PN} += "file-share-perl"
RDEPENDS:${PN} += "file-which-perl"
RDEPENDS:${PN} += "hash-merge-simple-perl"
RDEPENDS:${PN} += "hash-multivalue-perl"
RDEPENDS:${PN} += "http-date-perl"
RDEPENDS:${PN} += "http-headers-fast-perl"
RDEPENDS:${PN} += "import-into-perl"
RDEPENDS:${PN} += "json-maybexs-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "path-tiny-perl"
RDEPENDS:${PN} += "plack-middleware-fixmissingbodyinredirect-perl"
RDEPENDS:${PN} += "plack-middleware-removeredundantbody-perl"
RDEPENDS:${PN} += "plack-perl"
RDEPENDS:${PN} += "ref-util-perl"
RDEPENDS:${PN} += "role-tiny-perl"
RDEPENDS:${PN} += "safe-isa-perl"
RDEPENDS:${PN} += "sub-quote-perl"
RDEPENDS:${PN} += "template-tiny-perl"
RDEPENDS:${PN} += "template-toolkit-perl"
RDEPENDS:${PN} += "type-tiny-perl"
RDEPENDS:${PN} += "uri-perl"
RDEPENDS:${PN} += "yaml-perl"
RRECOMMENDS:${PN} += "cgi-deurl-xs-perl"
RRECOMMENDS:${PN} += "class-xsaccessor-perl"
RRECOMMENDS:${PN} += "cpanel-json-xs-perl"
RRECOMMENDS:${PN} += "crypt-urandom-perl"
RRECOMMENDS:${PN} += "http-xscookies-perl"
RRECOMMENDS:${PN} += "http-xsheaders-perl"
# Do not use Math::Random::ISAAC::XS until linking problem with Module::Build
# is fixed. Avoid application servers crash immediately with:
#     lib/Math/Random/ISAAC/XS.c: loadable library and perl binaries are mismatched (got handshake key 0x9800000, needed 0x9900000)
# RRECOMMENDS:${PN} += "math-random-isaac-xs-perl"
RRECOMMENDS:${PN} += "moox-typetiny-perl"
RRECOMMENDS:${PN} += "scope-upper-perl"
RRECOMMENDS:${PN} += "type-tiny-xs-perl"
RRECOMMENDS:${PN} += "url-encode-xs-perl"
RRECOMMENDS:${PN} += "yaml-libyaml-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "http-cookies-perl-native"
DEPENDS += "http-message-perl-native"
DEPENDS += "test-eol-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Dancer2-${PV}"

inherit cpan allarch

do_configure:prepend() {
        sed -i -e "s:^#!/usr/bin/env :#!:" script/dancer2
}

BBCLASSEXTEND = "native"
