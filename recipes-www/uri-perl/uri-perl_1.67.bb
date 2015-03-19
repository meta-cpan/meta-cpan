DESCRIPTION = "This module implements the \"URI\" class. Objects of this class \
represent \"Uniform Resource Identifier references\" as specified in \
RFC 2396 (and \
updated by RFC 2732)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.67.tar.gz"

SRC_URI[md5sum] = "d0ef53b6c63bcc02ba55f405c30741e3"
SRC_URI[sha256sum] = "7088d43d5f4902becfa5e0627751f5e6d0e0bdd1637b2d39e70ce807068a274e"
RRECOMMENDS_${PN} += "business-isbn-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
