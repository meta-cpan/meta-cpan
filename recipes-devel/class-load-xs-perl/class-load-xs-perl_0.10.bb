DESCRIPTION = "This module provides an XS implementation for portions of Class::Load. See \
Class::Load for API details."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Load-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-XS-0.10.tar.gz"

SRC_URI[md5sum] = "2c15488b5b28afadbb5315e44a721e05"
SRC_URI[sha256sum] = "5bc22cf536ebfd2564c5bdaf42f0d8a4cee3d1930fc8b44b7d4a42038622add1"
RDEPENDS_${PN} += "class-load-perl"
DEPENDS += "module-implementation-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/Class-Load-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
