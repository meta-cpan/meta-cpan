DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a "CSV" string and parse a "CSV" string into fields."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-CSV_XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HM/HMBRAND/Text-CSV_XS-1.44.tgz"

SRC_URI[md5sum] = "7ed1bfe174b8867bb0987625e9ed57bc"
SRC_URI[sha256sum] = "c4812ddca8e2654736c44bc2ce60b27a428a1bc4d5364b0ed1fad3609c8f9bc4"

S = "${WORKDIR}/Text-CSV_XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
