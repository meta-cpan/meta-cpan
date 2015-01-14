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

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA-5.95.tar.gz"

SRC_URI[md5sum] = "9ba7ba91935d041a02fe380d9a47d1f7"
SRC_URI[sha256sum] = "c7573f0f3b2bc280f8567c76eb2422ee8da19af5a5fa75988dc47e14de2e1471"

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
