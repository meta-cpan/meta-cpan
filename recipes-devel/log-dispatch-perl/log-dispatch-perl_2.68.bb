DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can be \
logged to via a unified interface."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Log-Dispatch-2.68.tar.gz"

SRC_URI[md5sum] = "c273198cd4ffee4bf51b398a45e785ba"
SRC_URI[sha256sum] = "d07a3039997a6df2fa02849ed5a6a0560c154018bf988c5cc202069be11aadaf"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "specio-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN}-dev += "dist-checkconflicts-perl"
DEPENDS += "ipc-run3-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/Log-Dispatch-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

FILES_${PN}-dev += "${PERLLIBDIRS}/vendor_perl/${PERLVERSION}/Log/Dispatch/Conflicts.pm"
