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

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GAAS/HTML-Parser-3.72.tar.gz"

SRC_URI[md5sum] = "eb7505e5f626913350df9dd4a03d54a8"
SRC_URI[sha256sum] = "ec28c7e1d9e67c45eca197077f7cdc41ead1bb4c538c7f02a3296a4bb92f608b"
RDEPENDS_${PN} += "html-tagset-perl"
RRECOMMENDS_${PN} += "http-message-perl"

S = "${WORKDIR}/HTML-Parser-${PV}"

inherit cpan

do_compile() {
       export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
       cpan_do_compile
}

BBCLASSEXTEND = "native"
