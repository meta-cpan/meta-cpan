DESCRIPTION = "A module to implement some of AutoConf macros in pure perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-AutoConf"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Config-AutoConf-0.309.tar.gz"

SRC_URI[md5sum] = "a3c6370a7501725e109ea8179c510424"
SRC_URI[sha256sum] = "b86d8f24d6520fb8fd6a85b51c6732ce96d2b7a6fe7ce87813c15b47153b0cdb"
RDEPENDS_${PN} += "capture-tiny-perl"
RRECOMMENDS_${PN} += "extutils-cbuilder-perl"
RRECOMMENDS_${PN} += "file-slurp-tiny-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
