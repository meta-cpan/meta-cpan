DESCRIPTION = "This module provides a \"clone()\" method which makes recursive copies \
of nested hash, array, scalar and reference types, including tied \
variables and \
objects."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Clone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GARU/Clone-0.38.tar.gz"

SRC_URI[md5sum] = "17d119f9579b4b3ec43c87a4138ed44a"
SRC_URI[sha256sum] = "9fb0534bb7ef6ca1f6cc1dc3f29750d6d424394d14c40efdc77832fad3cebde8"

S = "${WORKDIR}/Clone-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
