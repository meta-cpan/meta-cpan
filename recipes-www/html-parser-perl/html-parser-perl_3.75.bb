DESCRIPTION = "Objects of the "HTML::Parser" class will recognize markup and separate it \
from plain text (alias data content) in HTML documents. As different kinds \
of markup and text are recognized, the corresponding event handlers are \
invoked."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTML-Parser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CA/CAPOEIRAB/HTML-Parser-3.75.tar.gz"

SRC_URI[md5sum] = "65bf65aa8b34b35443e094010f991406"
SRC_URI[sha256sum] = "ac6b5e25a8df7af54885201e91c45fb9ab6744c08cedc1a38fcc7d95d21193a9"
RDEPENDS_${PN} += "html-tagset-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "uri-perl"

S = "${WORKDIR}/HTML-Parser-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
