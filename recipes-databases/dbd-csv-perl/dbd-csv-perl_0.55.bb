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
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HM/HMBRAND/DBD-CSV-0.55.tgz"

SRC_URI[md5sum] = "63b251baebd0c9609f69bf52647a6509"
SRC_URI[sha256sum] = "4670028e46df9a3c2791740445e8a4c82840b6667cee5dd796bc5a6ad9266ddb"
RDEPENDS_${PN} += "dbi-perl"
RDEPENDS_${PN} += "sql-statement-perl"
RDEPENDS_${PN} += "text-csv-xs-perl"

S = "${WORKDIR}/DBD-CSV-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
