DESCRIPTION = "This module provides bare bones \"try\"/\"catch\"/\"finally\" \
statements that are designed to minimize common mistakes with eval \
blocks, and NOTHING else."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Try-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Try-Tiny-0.22.tar.gz"

SRC_URI[md5sum] = "6769658bfbca241a470206c9a8819ff2"
SRC_URI[sha256sum] = "60fba46f4693d33d54539104f9001df008dabb400b6837e9605c39a6ee6a1b19"
RECOMMENDS += "capture-tiny-perl-native"
RECOMMENDS += "sub-name-perl-native"

S = "${WORKDIR}/Try-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
