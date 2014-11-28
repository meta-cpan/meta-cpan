DESCRIPTION = "At some point or another, most programmers find they need to compare \
floating-point numbers for equality. The typical idiom is to test if \
the \
absolute value of the difference of the numbers is within a desired \
tolerance, usually called epsilon. This module provides such a function \
for \
use with Test::More. Usage is similar to other test functions described \
in \
Test::More. Semantically, the \"delta_within\" function replaces this \
kind of \
construct:"

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Number-Delta"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Test-Number-Delta-1.06.tar.gz"

SRC_URI[md5sum] = "f0d420e7f679a0bc593713d21c25f51e"
SRC_URI[sha256sum] = "535430919e6fdf6ce55ff76e9892afccba3b7d4160db45f3ac43b0f92ffcd049"

S = "${WORKDIR}/Test-Number-Delta-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
