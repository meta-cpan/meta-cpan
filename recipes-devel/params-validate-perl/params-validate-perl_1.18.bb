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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.18.tar.gz"

SRC_URI[md5sum] = "2d6c94dd441cd96f98844aa19ebdbcb2"
SRC_URI[sha256sum] = "b25d2488d326f0cfa303cba7ed64fed9ec698b7bfc5d408f0b71058af39206c1"
RDEPENDS_${PN} += "module-implementation-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Params-Validate-${PV}"

inherit cpan_build

EXTRA_BUILDFLAGS="--pp"

BBCLASSEXTEND = "native"
