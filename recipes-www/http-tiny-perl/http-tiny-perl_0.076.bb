DESCRIPTION = "This is a very simple HTTP/1.1 client, designed for doing simple requests \
without the overhead of a large framework like LWP::UserAgent."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/HTTP-Tiny-0.076.tar.gz"

SRC_URI[md5sum] = "752d43443c6cf9254b23b281a753120b"
SRC_URI[sha256sum] = "ddbdaa2fb511339fa621a80021bf1b9733fddafc4fe0245f26c8b92171ef9387"
RRECOMMENDS_${PN} += "http-cookiejar-perl"
RRECOMMENDS_${PN} += "io-socket-ssl-perl"
RRECOMMENDS_${PN} += "mozilla-ca-perl"
RRECOMMENDS_${PN} += "net-ssleay-perl"

S = "${WORKDIR}/HTTP-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
