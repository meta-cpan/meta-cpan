DESCRIPTION = "The SQL::Statement module implements a pure Perl SQL parsing and execution \
engine. While it by no means implements full ANSI standard, it does support \
many features including column and table aliases, built-in and user-defined \
functions, implicit and explicit joins, complex nested search conditions, \
and other features."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/SQL-Statement"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/SQL-Statement-1.414.tar.gz"

SRC_URI[md5sum] = "f93b655aef646b478ccac8d08a7115dd"
SRC_URI[sha256sum] = "dde8bdcfa6a136eedda06519ba0f3efaec085c39db0df9c472dc0ec6cd781a49"
RDEPENDS:${PN} += "clone-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "params-util-perl"
RRECOMMENDS:${PN} += "math-base-convert-perl"
RRECOMMENDS:${PN} += "perl"
DEPENDS += "math-base-convert-perl-native"
DEPENDS += "perl"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/SQL-Statement-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
