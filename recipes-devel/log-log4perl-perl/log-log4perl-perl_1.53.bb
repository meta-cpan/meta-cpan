DESCRIPTION = "Log::Log4perl lets you remote-control and fine-tune the logging behaviour \
of your system from the outside. It implements the widely popular \
(Java-based) Log4j logging package in pure Perl."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Log4perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETJ/Log-Log4perl-1.53.tar.gz"

SRC_URI[md5sum] = "48fcd8fa105af31d9e5247cb8e5b6ff1"
SRC_URI[sha256sum] = "8fbfb48d016eec7344a539f3ad70870b4ac4638e49666bfa70d10f6ffd4ac38e"
RRECOMMENDS_${PN} += "dbd-csv-perl"
RRECOMMENDS_${PN} += "dbd-sqlite-perl"
RRECOMMENDS_${PN} += "dbi-perl"
RRECOMMENDS_${PN} += "log-dispatch-filerotate-perl"
RRECOMMENDS_${PN} += "log-dispatch-perl"
RRECOMMENDS_${PN} += "sql-statement-perl"
RRECOMMENDS_${PN} += "xml-dom-perl"

S = "${WORKDIR}/Log-Log4perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
