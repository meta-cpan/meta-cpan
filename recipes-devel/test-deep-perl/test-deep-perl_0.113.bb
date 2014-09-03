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

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-0.113.tar.gz"

SRC_URI[md5sum] = "1b68990b46afee0ad89f2d6b86ea4114"
SRC_URI[sha256sum] = "1f28f96e3be35208965ff5b926968cfebd26bec0cce17aa48fdb1602c4973668"
RDEPENDS_${PN} += "test-nowarnings-perl"
RDEPENDS_${PN} += "test-tester-perl"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
