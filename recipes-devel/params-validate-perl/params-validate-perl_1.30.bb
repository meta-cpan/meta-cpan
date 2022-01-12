DESCRIPTION = "I would recommend you consider using Params::ValidationCompiler instead. \
That module, despite being pure Perl, is *significantly* faster than this \
one, at the cost of having to adopt a type system such as Specio, \
Type::Tiny, or the one shipped with Moose."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-Validate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-Validate-1.30.tar.gz"

SRC_URI[md5sum] = "2f1f7f3a1845974d9fc44d16cac1a0fb"
SRC_URI[sha256sum] = "9a3a35583d3125d07e8c802c1f92f5be7d526e76dd496e944da270b1e273d812"
RDEPENDS:${PN} += "module-implementation-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Params-Validate-${PV}"

inherit cpan_build allarch

# daisy
EXTRA_BUILDFLAGS="--pureperl_only"
# jethro+
EXTRA_CPAN_BUILD_FLAGS="--pureperl_only"

BBCLASSEXTEND = "native"
