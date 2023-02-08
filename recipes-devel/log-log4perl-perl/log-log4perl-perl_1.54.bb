DESCRIPTION = "Log::Log4perl lets you remote-control and fine-tune the logging behaviour \
of your system from the outside. It implements the widely popular \
(Java-based) Log4j logging package in pure Perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Log4perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETJ/Log-Log4perl-1.54.tar.gz"

SRC_URI[md5sum] = "46c5a3a101921c25857f84585cd0b5c2"
SRC_URI[sha256sum] = "bbabe42d3b4cdaa3a47666b957be81d55bbd1cbcffcdff2b119586d33602eabe"
RRECOMMENDS:${PN} += "dbd-csv-perl"
RRECOMMENDS:${PN} += "dbd-sqlite-perl"
RRECOMMENDS:${PN} += "libdbi-perl"
RRECOMMENDS:${PN} += "log-dispatch-filerotate-perl"
RRECOMMENDS:${PN} += "log-dispatch-perl"
RRECOMMENDS:${PN} += "sql-statement-perl"
RRECOMMENDS:${PN} += "xml-dom-perl"

S = "${WORKDIR}/Log-Log4perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
