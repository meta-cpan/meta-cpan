DESCRIPTION = "This module provides a number of utility functions for performing \
common or useful operations when setting up a Sub::Exporter \
configuration. All of the \
utilities may be exported, but none are by default."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Exporter"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Sub-Exporter-0.987.tar.gz"

SRC_URI[md5sum] = "5332d269a7ba387773fcd140b72a0ed2"
SRC_URI[sha256sum] = "543cb2e803ab913d44272c7da6a70bb62c19e467f3b12aaac4c9523259b083d6"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "sub-install-perl"

S = "${WORKDIR}/Sub-Exporter-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
