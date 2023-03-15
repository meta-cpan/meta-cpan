DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Headers-Fast"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/HTTP-Headers-Fast-0.22.tar.gz"

SRC_URI[md5sum] = "a166a4d0ba47eca8ff9dffb760865f5f"
SRC_URI[sha256sum] = "cc431db68496dd884db4bc0c0b7112c1f4a4f1dc68c4f5a3caa757a1e7481b48"
RDEPENDS:${PN} += "http-date-perl"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/HTTP-Headers-Fast-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
