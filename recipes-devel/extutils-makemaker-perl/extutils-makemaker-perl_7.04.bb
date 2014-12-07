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

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/ExtUtils-MakeMaker-7.04.tar.gz"

SRC_URI[md5sum] = "c280fa6a0dfe1d21d6b42792c041ddf7"
SRC_URI[sha256sum] = "98126b012d70c2af0f8e33a07ebe0d6f2340281b2460981b959a9fb31d5ad97f"

S = "${WORKDIR}/ExtUtils-MakeMaker-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
