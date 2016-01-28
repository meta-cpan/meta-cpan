DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Headers-Fast"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/HTTP-Headers-Fast-0.20.tar.gz"

SRC_URI[md5sum] = "7f1f80c0407e9ad313e7673800336905"
SRC_URI[sha256sum] = "d2f4c9724618e74f300fc746498fb5849692ef0cfc4af47fe499c4063969e520"
RDEPENDS_${PN} += "http-date-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/HTTP-Headers-Fast-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
