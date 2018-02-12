DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-Hooks-EndOfScope"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/B-Hooks-EndOfScope-0.21.tar.gz"

SRC_URI[md5sum] = "df9dacbf55a01d7a444b1ebc616435ae"
SRC_URI[sha256sum] = "90f3580880f1d68b843c142cc86f58bead1f3e03634c63868ac9eba5eedae02c"
RDEPENDS_${PN} += "module-implementation-perl"
RDEPENDS_${PN} += "sub-exporter-progressive-perl"

S = "${WORKDIR}/B-Hooks-EndOfScope-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
