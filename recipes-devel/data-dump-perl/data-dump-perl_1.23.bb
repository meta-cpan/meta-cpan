DESCRIPTION = "This module provide a few functions that traverse their argument and \
produces a string as its result. The string contains Perl code that, \
when \
\"eval\"ed, produces a deep copy of the original arguments."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Dump"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GAAS/Data-Dump-1.23.tar.gz"

SRC_URI[md5sum] = "762c111e525c82ff23d62c90821b26e9"
SRC_URI[sha256sum] = "af53b05ef1387b4cab4427e6789179283e4f0da8cf036e8db516ddb344512b65"

S = "${WORKDIR}/Data-Dump-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
