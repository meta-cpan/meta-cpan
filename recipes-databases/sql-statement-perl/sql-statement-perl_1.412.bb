DESCRIPTION = "The SQL::Statement module implements a pure Perl SQL parsing and execution \
engine. While it by no means implements full ANSI standard, it does support \
many features including column and table aliases, built-in and user-defined \
functions, implicit and explicit joins, complex nested search conditions, \
and other features."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/SQL-Statement"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/SQL-Statement-1.412.tar.gz"

SRC_URI[md5sum] = "aa3653325bb627e32021240ff0af3b05"
SRC_URI[sha256sum] = "65c870883379c11b53f19ead10aaac241ccc86a90bbab77f6376fe750720e5c8"
RDEPENDS_${PN} += "clone-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-util-perl"
RRECOMMENDS_${PN} += "math-base-convert-perl"
RRECOMMENDS_${PN} += "perl"
DEPENDS += "math-base-convert-perl-native"
DEPENDS += "perl"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/SQL-Statement-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
