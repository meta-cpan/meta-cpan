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

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA-5.92.tar.gz"

SRC_URI[md5sum] = "f6de59c9f7e23c3a46eedc0c20f56559"
SRC_URI[sha256sum] = "9f31ea3aadd6521dbe3495acc784edc4d50f76fc3e36019dfadc64ee45181287"

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
