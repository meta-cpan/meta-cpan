DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a "CSV" string and parse a "CSV" string into fields."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV_XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HM/HMBRAND/Text-CSV_XS-1.47.tgz"

SRC_URI[md5sum] = "42187231c4ac6897a0e07a5782eb6718"
SRC_URI[sha256sum] = "4bbaffbdfb68505ef3326dc748e63ebe0db31157b78ca8dfcb8c3cd1d1313262"
RRECOMMENDS:${PN} += "encode-perl"

S = "${WORKDIR}/Text-CSV_XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
