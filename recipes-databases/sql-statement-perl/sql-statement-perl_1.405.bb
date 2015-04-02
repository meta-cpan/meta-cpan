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

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/SQL-Statement-1.405.tar.gz"

SRC_URI[md5sum] = "22231c2e28996b5bfea9925d49c11de1"
SRC_URI[sha256sum] = "239094b6f18c36d174a7a9aa73c13cbaf9fec83d68dce5a2226a6120bb673026"
RDEPENDS_${PN} += "clone-perl"
RDEPENDS_${PN} += "params-util-perl"

S = "${WORKDIR}/SQL-Statement-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
