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

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA3-0.22.tar.gz"

SRC_URI[md5sum] = "dd99a53c6950b6845cda7e6b929b25d5"
SRC_URI[sha256sum] = "f2718f10b0acf5e5bd55c0e472115cf65c92f234984b018567329b5f1096ea2b"

S = "${WORKDIR}/Digest-SHA3-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
