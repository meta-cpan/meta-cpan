DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-ValidationCompiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-ValidationCompiler-0.27.tar.gz"

SRC_URI[md5sum] = "a6937d7aba4417ad7d4edeb1f9988ac3"
SRC_URI[sha256sum] = "50a99968359d430e34ea8a12e7f08a669ffd34a3dae4d8ea9ca076c1100af9b2"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "exception-class-perl"
DEPENDS += "specio-perl-native"
DEPENDS += "test-without-module-perl-native"
DEPENDS += "test2-plugin-nowarnings-perl-native"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Params-ValidationCompiler-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
