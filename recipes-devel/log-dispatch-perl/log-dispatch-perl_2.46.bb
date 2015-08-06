DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can \
be logged to via a unified interface."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Log-Dispatch-2.46.tar.gz"

SRC_URI[md5sum] = "14eb2a02eb98c6abc077be6dd419c41a"
SRC_URI[sha256sum] = "fa41bf86baa01aed8a849fb71b1afe0b1ab6f5597d8878008cd3a6c79710673c"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Log-Dispatch-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
