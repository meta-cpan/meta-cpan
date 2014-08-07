DESCRIPTION = "If you don't know anything about automated testing in Perl then you \
should probably read about Test::Simple and Test::More before \
preceding. Test::Deep \
uses the Test::Builder framework."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Deep"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "test-nowarnings-perl"
DEPENDS += "test-tester-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-0.112.tar.gz"

SRC_URI[md5sum] = "8568575c2ebfd793574250ddb7da6ac8"
SRC_URI[sha256sum] = "56696a09a221b03b56e7203d84e27a6af0496e9c1e8d33fb05f2e24bc35ae1ed"

S = "${WORKDIR}/Test-Deep-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
