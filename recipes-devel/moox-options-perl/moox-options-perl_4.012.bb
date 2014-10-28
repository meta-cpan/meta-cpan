DESCRIPTION = "Create a command line tool with your Mo, Moo, Moose objects."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Options"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CE/CELOGEEK/MooX-Options-4.012.tar.gz \
          file://no-term-size-any.patch \
	 "

SRC_URI[md5sum] = "39a68d37d609da937a3ac33354db2075"
SRC_URI[sha256sum] = "acb383a9cfd829ad2b3f548b56f30862289cc61258b1b3c15207593a9f3c7034"
RDEPENDS_${PN} += "data-record-perl"
RDEPENDS_${PN} += "getopt-long-descriptive-perl"
RDEPENDS_${PN} += "json-perl"
RDEPENDS_${PN} += "moox-configfromfile-perl"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "path-class-perl"
RDEPENDS_${PN} += "regexp-common-perl"
RDEPENDS_${PN} += "unicode-linebreak-perl"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "namespace-clean-perl-native"
DEPENDS += "perl"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-trap-perl-native"
DEPENDS += "try-tiny-perl-native"

S = "${WORKDIR}/MooX-Options-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
