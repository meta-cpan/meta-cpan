DESCRIPTION = "The "Specio" distribution provides classes for representing type \
constraints and coercion, along with syntax sugar for declaring them."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Specio"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Specio-0.42.tar.gz"

SRC_URI[md5sum] = "215714bd0038defe4ca303d90c1ed585"
SRC_URI[sha256sum] = "23298b93a26d7ae3c1d58106f5898d84ddc71b626afdbf801bddb04d5e524ef6"
RDEPENDS_${PN} += "devel-stacktrace-perl"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "sub-quote-perl"
RDEPENDS_${PN} += "test-fatal-perl"
RDEPENDS_${PN} += "try-tiny-perl"

S = "${WORKDIR}/Specio-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
