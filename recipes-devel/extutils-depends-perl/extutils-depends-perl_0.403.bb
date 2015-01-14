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

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XA/XAOC/ExtUtils-Depends-0.403.tar.gz"

SRC_URI[md5sum] = "bf28c1aad4e1d8761f598ab0b0531dd9"
SRC_URI[sha256sum] = "3963e9bc3910b38f402bfdc97fff1f2c87a38db8e5efc20f75f080358bc0594c"
RECOMMENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/ExtUtils-Depends-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
