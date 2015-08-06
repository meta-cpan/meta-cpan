DESCRIPTION = "This module is a translation of the C math.h file. It exports the \
following selected constants and functions."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Libm"

LIC_FILES_CHKSUM = "file://${THISDIR}/math-libm-perl/copyright;md5=d843e1a5ef49154a634b896878333c83"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DS/DSLEWART/Math-Libm-1.00.tar.gz"

SRC_URI[md5sum] = "26a4ce8fe507d04c7d40b9eadac428ae"
SRC_URI[sha256sum] = "bfd309f283ac8cb9bf00af8c7c3a10bf25abfd642861c2022efaff0a4a52c276"

S = "${WORKDIR}/Math-Libm-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
