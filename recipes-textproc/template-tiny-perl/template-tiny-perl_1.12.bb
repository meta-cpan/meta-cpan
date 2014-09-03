DESCRIPTION = "Template::Tiny is a reimplementation of a subset of the functionality \
from Template Toolkit in as few lines of code as possible."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Template-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Template-Tiny-1.12.tar.gz"

SRC_URI[md5sum] = "166662a3d24c1c5f995c2ffc26e0eb36"
SRC_URI[sha256sum] = "073e062c630b51dfb725cd6485a329155cb72d5c596e8cb698eb67c4566f0a4a"

S = "${WORKDIR}/Template-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
