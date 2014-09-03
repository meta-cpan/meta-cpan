DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-Hooks-EndOfScope"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/B-Hooks-EndOfScope-0.13.tar.gz"

SRC_URI[md5sum] = "6cdaaa88a39054cd13aacad7bd2171da"
SRC_URI[sha256sum] = "f17ef12e1ea7667dc072edb2ee5bcfc54359ad77e60163a56b43383e1705adb8"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "sub-exporter-progressive-perl"
RRECOMMENDS_${PN} += "variable-magic-perl"
RECOMMENDS += "perl"

S = "${WORKDIR}/B-Hooks-EndOfScope-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
