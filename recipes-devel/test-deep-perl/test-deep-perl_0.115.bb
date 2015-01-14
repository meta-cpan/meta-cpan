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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-0.115.tar.gz"

SRC_URI[md5sum] = "63bf86f7cddb09320c846acb1a1ec263"
SRC_URI[sha256sum] = "0f2f5d41e4c4454b01dedf3fa753cd51001b16e5336702e1b2c5b206a1bdc39c"
DEPENDS += "test-tester-perl-native"
DEPENDS += "test-nowarnings-perl-native"
RDEPENDS_${PN} += "test-nowarnings-perl"
RDEPENDS_${PN} += "test-tester-perl"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
