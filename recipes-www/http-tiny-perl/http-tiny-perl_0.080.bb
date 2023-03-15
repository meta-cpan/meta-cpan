DESCRIPTION = "This is a very simple HTTP/1.1 client, designed for doing simple requests \
without the overhead of a large framework like LWP::UserAgent."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/HTTP-Tiny-0.080.tar.gz"

SRC_URI[md5sum] = "f69036740f965fc34dd50cd8f7539476"
SRC_URI[sha256sum] = "243c6d566aa8f160fa1c6b0b92e5752356136b341ffffdd3ec07b23b745fde15"
RRECOMMENDS:${PN} += "http-cookiejar-perl"
RRECOMMENDS:${PN} += "io-socket-ssl-perl"
RRECOMMENDS:${PN} += "mozilla-ca-perl"
RRECOMMENDS:${PN} += "net-ssleay-perl"

S = "${WORKDIR}/HTTP-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
