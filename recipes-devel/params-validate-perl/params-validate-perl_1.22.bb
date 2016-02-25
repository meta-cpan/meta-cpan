DESCRIPTION = "The Params::Validate module allows you to validate method or function call \
parameters to an arbitrary level of specificity. At the simplest level, it \
is capable of validating the required parameters were given and that no \
unspecified additional parameters were passed in."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Validate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.22.tar.gz"

SRC_URI[md5sum] = "f97cfb4669cdfaa10f85c4e200ffdd35"
SRC_URI[sha256sum] = "0df8bc8543a75b25ea355a12cf2ef0bb9c85c6083988839adb0e5f98f8bf33b5"
RDEPENDS_${PN} += "module-implementation-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Params-Validate-${PV}"

inherit cpan_build allarch

# daisy
EXTRA_BUILDFLAGS="--pp"
# jethro+
EXTRA_CPAN_BUILD_FLAGS="--pp"

BBCLASSEXTEND = "native"
