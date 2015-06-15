DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can \
be logged to via a unified interface."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Log-Dispatch-2.45.tar.gz"

SRC_URI[md5sum] = "1d07309e607252c676d7e00f175f6ff8"
SRC_URI[sha256sum] = "707fc17d1f072150b87d400e5994b46ae2083a7120a9d21d37680ade08084bd6"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Log-Dispatch-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
