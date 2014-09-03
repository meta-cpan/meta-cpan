DESCRIPTION = "This module implements the \"URI\" class. Objects of this class \
represent \"Uniform Resource Identifier references\" as specified in \
RFC 2396 (and updated by RFC 2732)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.64.tar.gz"

SRC_URI[md5sum] = "975b2282bc8f0fd72a6dae5cefc33824"
SRC_URI[sha256sum] = "ab7f5fbc80da4ed9c46d63ed956c68a09e83dae30f20c2778c3e056d41883f9d"
RRECOMMENDS_${PN} += "business-isbn-perl"

S = "${WORKDIR}/URI-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
