DESCRIPTION = "This module hooks $SIG{__WARN__} and converts warnings to Test::More \
\"fail()\" calls. It is designed to be used with \"done_testing\", when \
you don't need to know the test count in advance."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-FailWarnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Test-FailWarnings-0.008.tar.gz"

SRC_URI[md5sum] = "c03d51f550dbfd9945722ff7f4c32717"
SRC_URI[sha256sum] = "da34ef9029f6849d6026201d49127d054ee6ac4b979c82210315f5721964a96f"
DEPENDS += "capture-tiny-perl-native"

S = "${WORKDIR}/Test-FailWarnings-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
