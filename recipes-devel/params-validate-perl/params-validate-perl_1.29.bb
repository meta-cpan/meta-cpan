DESCRIPTION = "The Params::Validate module allows you to validate method or function call \
parameters to an arbitrary level of specificity. \
I would recommend you consider using Params::ValidationCompiler instead. \
That module, despite being pure Perl, is *significantly* faster than this \
one, at the cost of having to adopt a type system such as Specio, \
Type::Tiny, or the one shipped with Moose."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Validate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.29.tar.gz"

SRC_URI[md5sum] = "cebbbbef30ef71af513ed7c2fb4faf43"
SRC_URI[sha256sum] = "49a68dfb430bea028042479111d19068e08095e5a467e320b7ab7bde3d729733"
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
