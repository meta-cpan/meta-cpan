DESCRIPTION = "This module implements the "URI" class. Objects of this class represent \
"Uniform Resource Identifier references" as specified in RFC 2396 (and \
updated by RFC 2732)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/URI-5.10.tar.gz"

SRC_URI[md5sum] = "2a00d3dbf891df4256d251382aefd9b9"
SRC_URI[sha256sum] = "16325d5e308c7b7ab623d1bf944e1354c5f2245afcfadb8eed1e2cae9a0bd0b5"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
