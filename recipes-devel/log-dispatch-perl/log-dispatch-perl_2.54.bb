DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can \
be logged to via a unified interface."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Log-Dispatch-2.54.tar.gz"

SRC_URI[md5sum] = "293bb7b75953de871a9ff70b1fbe058e"
SRC_URI[sha256sum] = "7c365b8cdd2712cb642421773665d67a0a190cc6b44d19b804671c7631193f81"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN}-dev += "dist-checkconflicts-perl"
DEPENDS += "dist-checkconflicts-perl-native"
DEPENDS += "ipc-run3-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Log-Dispatch-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

FILES_${PN}-dev += "${PERLLIBDIRS}/vendor_perl/${PERLVERSION}/Log/Dispatch/Conflicts.pm"
