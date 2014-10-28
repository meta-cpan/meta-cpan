DESCRIPTION = "Digest::SHA is written in C for speed. If your platform lacks a C \
compiler, you can install the functionally equivalent (but much slower) \
Digest::SHA::PurePerl module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-SHA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA-5.93.tar.gz"

SRC_URI[md5sum] = "d3cc8a7af2b04d3d10f4202874cc6659"
SRC_URI[sha256sum] = "ffa160468332bf2c8e7183e39e54ecfeb65149e46e63065091001e8c00f4f28f"

S = "${WORKDIR}/Digest-SHA-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

inherit update-alternatives

ALTERNATIVE_PRIORITY = "100"

ALTERNATIVE_${PN} = "shasum"
ALTERNATIVE_LINK_NAME[shasum] = "${bindir}/shasum"

BBCLASSEXTEND = "native"
