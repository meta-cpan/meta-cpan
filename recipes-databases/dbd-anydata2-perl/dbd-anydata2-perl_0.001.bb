DESCRIPTION = "DBD::AnyData2 is a database management system that works right out of the \
box. If you have a standard installation of Perl and DBI you can begin \
creating, accessing, and modifying simple database tables without any \
further modules."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-AnyData2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/DBD-AnyData2-0.001.tar.gz"

SRC_URI[md5sum] = "04710558c1bf20e911e537b5b1253086"
SRC_URI[sha256sum] = "01410b92ff8d3f316feb1bb8e6d50131007cb6b4370211d331d47354ceada022"
RDEPENDS:${PN} += "anydata2-perl"
RDEPENDS:${PN} += "libdbi-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "sql-statement-perl"

S = "${WORKDIR}/DBD-AnyData2-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
