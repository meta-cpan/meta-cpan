DESCRIPTION = "The Params::Validate module allows you to validate method or function \
call parameters to an arbitrary level of specificity. At the simplest \
level, it \
is capable of validating the required parameters were given and that no \
unspecified additional parameters were passed in."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Validate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.20.tar.gz"

SRC_URI[md5sum] = "e7d669585d18f010244251c3b10837e1"
SRC_URI[sha256sum] = "766cdaf89c515c33f384c1eebd59547cf44f2fec85a11efd5521041af65352e2"
RDEPENDS_${PN} += "module-implementation-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Params-Validate-${PV}"

inherit cpan_build

EXTRA_BUILDFLAGS="--pp"

BBCLASSEXTEND = "native"
