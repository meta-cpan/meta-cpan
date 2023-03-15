DESCRIPTION = "Text::CSV is a thin wrapper for Text::CSV_XS-compatible modules now. All \
the backend modules provide facilities for the composition and \
decomposition of comma-separated values. Text::CSV uses Text::CSV_XS by \
default, and when Text::CSV_XS is not available, falls back on \
Text::CSV_PP, which is bundled in the same distribution as this module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/Text-CSV-2.01.tar.gz"

SRC_URI[md5sum] = "c8fe8236ab3115fe8d82bdb6545e0770"
SRC_URI[sha256sum] = "2a90a5eea3f22c40b87932a929621680609ab5f6b874a77c4134c8a04eb8e74b"
RRECOMMENDS:${PN} += "text-csv-xs-perl"

S = "${WORKDIR}/Text-CSV-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
