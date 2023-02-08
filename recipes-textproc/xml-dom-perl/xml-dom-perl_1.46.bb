DESCRIPTION = "This module extends the XML::Parser module by Clark Cooper. The XML::Parser \
module is built on top of XML::Parser::Expat, which is a lower level \
interface to James Clark's expat library."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-DOM"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TJ/TJMATHER/XML-DOM-1.46.tar.gz"

SRC_URI[md5sum] = "91ec808de616a2af54a5118619f8f9cc"
SRC_URI[sha256sum] = "8ba24b0b459b01d6c5e5b0408829c7d5dfe47ff79b3548c813759048099b175e"
RDEPENDS:${PN} += "libwww-perl-perl"
RDEPENDS:${PN} += "libxml-perl-perl"
RDEPENDS:${PN} += "xml-parser-perl"
RDEPENDS:${PN} += "xml-regexp-perl"

S = "${WORKDIR}/XML-DOM-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
