DESCRIPTION = "This module tries to make it easy to build Perl extensions that use \
functions and typemaps provided by other perl extensions. This means \
that a \
perl extension is treated like a shared library that provides also a C \
and \
an XS interface besides the perl one."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Depends"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/X/XA/XAOC/ExtUtils-Depends-0.402.tar.gz"

SRC_URI[md5sum] = "7df1130f5705b3cd496f461b522e6526"
SRC_URI[sha256sum] = "e0568976cfe175e281359240ceab91e9e6d737a34fcb6e51e4ad4b0fe2ab7733"
RECOMMENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/ExtUtils-Depends-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
