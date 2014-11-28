DESCRIPTION = "This utility is designed to write a Makefile for an extension module \
from a Makefile.PL. It is based on the Makefile.SH model provided by \
Andy Dougherty \
and the perl5-porters."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-MakeMaker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/ExtUtils-MakeMaker-7.02.tar.gz"

SRC_URI[md5sum] = "4e249fb6b148dd89465001f3905a1ead"
SRC_URI[sha256sum] = "087c0581f5a1c00a49439a675b326201fff3dcfa602c18799582e3b37819fe49"

S = "${WORKDIR}/ExtUtils-MakeMaker-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
