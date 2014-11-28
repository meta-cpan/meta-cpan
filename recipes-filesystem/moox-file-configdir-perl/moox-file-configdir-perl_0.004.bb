DESCRIPTION = "This module is a helper for easily find configuration file locations. \
Whether to use this information for find a suitable place for \
installing \
them or looking around for finding any piece of settings, heavily \
depends on \
the requirements."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-File-ConfigDir-0.004.tar.gz"

SRC_URI[md5sum] = "d090ec274c1cb4f3c387367eb811a5a8"
SRC_URI[sha256sum] = "7b9d05e9afbb158c71ee4d1f1aef0c5c72272177dc2b48de65f7663d05272d40"
RDEPENDS_${PN} += "file-configdir-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/MooX-File-ConfigDir-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
