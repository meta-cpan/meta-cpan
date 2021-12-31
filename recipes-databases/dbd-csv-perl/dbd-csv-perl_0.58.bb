DESCRIPTION = "The DBD::CSV module is yet another driver for the DBI (Database independent \
interface for Perl). This one is based on the SQL "engine" SQL::Statement \
and the abstract DBI driver DBD::File and implements access to so-called \
CSV files (Comma Separated Values). Such files are often used for exporting \
MS Access and MS Excel data."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-CSV"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HM/HMBRAND/DBD-CSV-0.58.tgz"

SRC_URI[md5sum] = "d81feeae24eca2cea6443f7de01d1312"
SRC_URI[sha256sum] = "6c26f710453b14d7b3cf5f3e1697e8ddaa48c0a66f5d811f4394bd8c32f287ef"
RDEPENDS:${PN} += "dbi-perl"
RDEPENDS:${PN} += "sql-statement-perl"
RDEPENDS:${PN} += "text-csv-xs-perl"
RECOMMENDS += "test-simple-perl-native"

S = "${WORKDIR}/DBD-CSV-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
