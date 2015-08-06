DESCRIPTION = "The Params::Validate module allows you to validate method or function \
call parameters to an arbitrary level of specificity. At the simplest \
level, it is capable of validating the required parameters were given \
and that no unspecified additional parameters were passed in."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Validate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.21.tar.gz"

SRC_URI[md5sum] = "c81e5d44cbda5aeb8a3be03b35dc410b"
SRC_URI[sha256sum] = "c4b78e7ce75c4fd49e9460d31ce6a3920e25ec72669762356c6cc5ea43e18175"
RDEPENDS_${PN} += "module-implementation-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Params-Validate-${PV}"

inherit cpan_build

# daisy
EXTRA_BUILDFLAGS="--pp"
# fido
EXTRA_CPAN_BUILD_FLAGS="--pp"

BBCLASSEXTEND = "native"
