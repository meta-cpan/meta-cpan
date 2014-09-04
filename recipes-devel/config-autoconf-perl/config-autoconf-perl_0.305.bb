DESCRIPTION = "A module to implement some of AutoConf macros in pure perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-AutoConf"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/Config-AutoConf-0.305.tar.gz"

SRC_URI[md5sum] = "c0e85943cbdc0c5853b04d0319a38975"
SRC_URI[sha256sum] = "7905d7752f0afedca0d6a0f008b8b489519c0b01dedc50de1fcce74520253cc0"
RDEPENDS_${PN} += "capture-tiny-perl"
RRECOMMENDS_${PN} += "file-slurp-tiny-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
