DESCRIPTION = "The "Specio" distribution provides classes for representing type \
constraints and coercion, along with syntax sugar for declaring them."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Specio"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Specio-0.47.tar.gz"

SRC_URI[md5sum] = "42a6734e5c02836f6d99646167694b96"
SRC_URI[sha256sum] = "f41307f14444f8777e572f27eeb6a964084399e7e382c47c577827ad8a286a1c"
RDEPENDS:${PN} += "devel-stacktrace-perl"
RDEPENDS:${PN} += "eval-closure-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "mro-compat-perl"
RDEPENDS:${PN} += "role-tiny-perl"
RDEPENDS:${PN} += "sub-quote-perl"
RDEPENDS:${PN} += "test-fatal-perl"
RDEPENDS:${PN} += "try-tiny-perl"
RRECOMMENDS:${PN} += "ref-util-perl"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/Specio-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
