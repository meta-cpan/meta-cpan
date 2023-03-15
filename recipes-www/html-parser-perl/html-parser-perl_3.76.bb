DESCRIPTION = "Objects of the "HTML::Parser" class will recognize markup and separate it \
from plain text (alias data content) in HTML documents. As different kinds \
of markup and text are recognized, the corresponding event handlers are \
invoked."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTML-Parser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/HTML-Parser-3.76.tar.gz"

SRC_URI[md5sum] = "60e266d5a07fbea671a0383dd8af7b6c"
SRC_URI[sha256sum] = "64d9e2eb2b420f1492da01ec0e6976363245b4be9290f03f10b7d2cb63fa2f61"
RDEPENDS:${PN} += "html-tagset-perl"
RDEPENDS:${PN} += "http-message-perl"
RDEPENDS:${PN} += "uri-perl"

S = "${WORKDIR}/HTML-Parser-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
