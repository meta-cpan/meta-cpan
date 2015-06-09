DESCRIPTION = "The SQL::Statement module implements a pure Perl SQL parsing and \
execution engine. While it by no means implements full ANSI standard, it \
does support many features including column and table aliases, built-in and \
user-defined functions, implicit and explicit joins, complex nested search \
conditions, and other features."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/SQL-Statement"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/SQL-Statement-1.407.tar.gz"

SRC_URI[md5sum] = "abeedda4a2c085613cb77fb01631e5de"
SRC_URI[sha256sum] = "f6e0c82b924a9eb983ad1561cad8bdd10f50fef97e53696e948ae167bd33b4d0"
RDEPENDS_${PN} += "clone-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "perl"
DEPENDS += "perl"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/SQL-Statement-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
