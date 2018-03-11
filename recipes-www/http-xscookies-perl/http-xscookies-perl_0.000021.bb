DESCRIPTION = "This module implements cookie creation (baking) and parsing (crushing) \
using XS, therefore improving the speed of a pure Perl implementation."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-XSCookies"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GO/GONZUS/HTTP-XSCookies-0.000021.tar.gz"

SRC_URI[md5sum] = "c4249eeaebc36ff8e3d7ce173a8d15f7"
SRC_URI[sha256sum] = "74e637d6f682f3025fbdf825f51c5be892a8458b5c6ae08c44a73cd8b658258a"
DEPENDS += "timedate-perl-native"

S = "${WORKDIR}/HTTP-XSCookies-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
