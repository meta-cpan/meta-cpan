DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Headers-Fast"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/HTTP-Headers-Fast-0.18.tar.gz"

SRC_URI[md5sum] = "af5819f7e93861e8f1f1467e6d541291"
SRC_URI[sha256sum] = "414d9b8525b15729cc470cd997486b34cf9350c2dd572712e1c12db295c5ff0c"
RDEPENDS_${PN} += "http-date-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/HTTP-Headers-Fast-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
