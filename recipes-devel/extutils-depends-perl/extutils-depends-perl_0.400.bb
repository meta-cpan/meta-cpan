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

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TS/TSCH/ExtUtils-Depends-0.400.tar.gz"

SRC_URI[md5sum] = "3c876c8199aec7c59d1b5df9fdaffd58"
SRC_URI[sha256sum] = "2f7a4c12fdd4d8ccbe6760bf8ff4b882880b4e7eff77eb3ec46c7e953dd3505f"
RECOMMENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/ExtUtils-Depends-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
