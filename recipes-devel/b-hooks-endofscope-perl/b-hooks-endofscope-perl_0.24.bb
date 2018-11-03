DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-Hooks-EndOfScope"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/B-Hooks-EndOfScope-0.24.tar.gz"

SRC_URI[md5sum] = "99a48be0694dfd12b40482c6a495e10f"
SRC_URI[sha256sum] = "03aa3dfe5d0aa6471a96f43fe8318179d19794d4a640708f0288f9216ec7acc6"
RDEPENDS_${PN} += "module-implementation-perl"
RDEPENDS_${PN} += "sub-exporter-progressive-perl"

S = "${WORKDIR}/B-Hooks-EndOfScope-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
