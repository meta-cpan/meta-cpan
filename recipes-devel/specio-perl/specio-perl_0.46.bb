DESCRIPTION = "The "Specio" distribution provides classes for representing type \
constraints and coercion, along with syntax sugar for declaring them."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Specio"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Specio-0.46.tar.gz"

SRC_URI[md5sum] = "aca3a183b46b93a8ce02009a2ccd868b"
SRC_URI[sha256sum] = "0bf42aa116076d6efc18f72b72c7acb5638bd41c0aa09aecc12fc8bf9ceb9596"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "sub-quote-perl"
RDEPENDS_${PN} += "test-fatal-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RRECOMMENDS_${PN} += "ref-util-perl"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/Specio-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
