DESCRIPTION = "This module makes the functionality of the perltidy utility available \
to perl scripts. Any or all of the input parameters may be omitted, in \
which case the @ARGV array will be used to provide input parameters as \
described in the perltidy(1) man page."

SECTION = "libs"
LICENSE = "GPL-2.0+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Perl-Tidy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-20140711.tar.gz"

SRC_URI[md5sum] = "b11587646b2252fccec5750ab584036b"
SRC_URI[sha256sum] = "1576ceb3fd9f592d0285affbe7192685963dc1d0411968cc0587d6ac0d7b3ad8"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
