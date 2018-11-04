DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Params-ValidationCompiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Params-ValidationCompiler-0.30.tar.gz"

SRC_URI[md5sum] = "f7746a98cab3d7a246372379d4658a4e"
SRC_URI[sha256sum] = "dc5bee23383be42765073db284bed9fbd819d4705ad649c20b644452090d16cb"
RDEPENDS_${PN} += "eval-closure-perl"
RDEPENDS_${PN} += "exception-class-perl"
RRECOMMENDS_${PN} += "class-xsaccessor-perl"
DEPENDS += "specio-perl-native"
DEPENDS += "test-simple-perl-native"
DEPENDS += "test-without-module-perl-native"
DEPENDS += "test2-plugin-nowarnings-perl-native"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Params-ValidationCompiler-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
