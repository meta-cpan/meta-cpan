DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-ValidationCompiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-ValidationCompiler-0.26.tar.gz"

SRC_URI[md5sum] = "4c2ff368615fb7c589f01af0b7a93489"
SRC_URI[sha256sum] = "6a9ea4895c9288ae4a0a2f5f1309d0dea8ffc46d429263c8f59a83c126c75805"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "exception-class-perl"
DEPENDS += "specio-perl-native"
DEPENDS += "test-without-module-perl-native"
DEPENDS += "test2-plugin-nowarnings-perl-native"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Params-ValidationCompiler-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
