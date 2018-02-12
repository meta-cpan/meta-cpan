DESCRIPTION = "This module decodes a URL-encoded parameter string in the manner of CGI.pm. \
However, as it uses C code from libapreq to perform the task, it's \
somewhere from slightly to much faster (depending on your strings) than \
using CGI or a functionally similar module like CGI::Deurl."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CGI-Deurl-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATHOMASON/CGI-Deurl-XS-0.08.tar.gz"

SRC_URI[md5sum] = "f177eba5ed5915bbf458afeeab414ea3"
SRC_URI[sha256sum] = "9a3c325582eab31e0ed431edd095f6f008fd734ee313bc65f582a1f3378b52a1"

S = "${WORKDIR}/CGI-Deurl-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
