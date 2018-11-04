DESCRIPTION = "The "Specio" distribution provides classes for representing type \
constraints and coercion, along with syntax sugar for declaring them."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Specio"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Specio-0.43.tar.gz"

SRC_URI[md5sum] = "7a8e7794b75a61d522c9d3c2815d1358"
SRC_URI[sha256sum] = "3cd0debf7b6404127d5e0bb7fb78cfef9df5e2519d3d6ad7113b59ad1da9fa1d"
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
