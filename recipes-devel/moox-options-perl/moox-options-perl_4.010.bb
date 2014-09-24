DESCRIPTION = "Create a command line tool with your Mo, Moo, Moose objects."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Options"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CE/CELOGEEK/MooX-Options-4.010.tar.gz"
SRC_URI += "file://no-term-size-any.patch"

SRC_URI[md5sum] = "72e883a1d41f8e8f5aa77a66cb39700e"
SRC_URI[sha256sum] = "cc7a3ffd9725077456b695e19ad1c14564a2f8cf077de7273bfa9bbc6b7094c3"
RDEPENDS_${PN} += "data-record-perl"
RDEPENDS_${PN} += "getopt-long-descriptive-perl"
RDEPENDS_${PN} += "json-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-configfromfile-perl"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "path-class-perl"
RDEPENDS_${PN} += "perl"
RDEPENDS_${PN} += "regexp-common-perl"
RDEPENDS_${PN} += "unicode-linebreak-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "namespace-clean-perl-native"
DEPENDS += "role-tiny-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "try-tiny-perl-native"

S = "${WORKDIR}/MooX-Options-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
