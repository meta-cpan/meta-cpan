DESCRIPTION = "Digest::SHA3 is written in C for speed. If your platform lacks a C \
compiler, perhaps you can find the module in a binary form compatible \
with your \
particular processor and operating system."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-SHA3"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA3-0.24.tar.gz"

SRC_URI[md5sum] = "4d3a5d8e71485955bab65755ade0d3b0"
SRC_URI[sha256sum] = "49a7aa146f720877d557cf4c74c03c76ebf01c6dce94d374edb2610176941f5f"

S = "${WORKDIR}/Digest-SHA3-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
