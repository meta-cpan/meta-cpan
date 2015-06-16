DESCRIPTION = "This module allows you to manage a set of deprecations for one or more \
modules."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-DeprecationManager"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Package-DeprecationManager-0.14.tar.gz"

SRC_URI[md5sum] = "e15e14a4e3f914eff937a55549692f51"
SRC_URI[sha256sum] = "ccd5b244b0db5ac78cbb2ecddbfeca1cb5556b281a5eaed3cd9a95001b298bb2"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "sub-install-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Package-DeprecationManager-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
