DESCRIPTION = "The Inline module allows you to put source code from other programming \
languages directly "inline" in a Perl script or module. The code is \
automatically compiled as needed, and then loaded for immediate access \
from \
Perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Inline"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETJ/Inline-0.66.tar.gz"

SRC_URI[md5sum] = "a8061825da4091dbb81ed52175349bef"
SRC_URI[sha256sum] = "29b0c481ef3aeb608a3f4336c8e6a8bc19ec38e53a177c475b1a6881f3beeb90"

S = "${WORKDIR}/Inline-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
