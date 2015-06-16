DESCRIPTION = "This module provides one function, \"equals\" (not exported by default)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Compare-ConstantTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/F/FR/FRACTAL/String-Compare-ConstantTime-0.310.tar.gz"

SRC_URI[md5sum] = "33d7cf50d3f348fd900a0eca671bd208"
SRC_URI[sha256sum] = "006e44c66c2efdf241d79460cf79fc0863211fd765093efb4f73752818edeaca"

S = "${WORKDIR}/String-Compare-ConstantTime-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
