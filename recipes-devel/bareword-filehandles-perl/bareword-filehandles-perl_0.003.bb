DESCRIPTION = "This module lexically disables the use of bareword filehandles with \
builtin functions, except for the special builitin filehandles "STDIN", \
"STDOUT", \
"STDERR", "ARGV", "ARGVOUT" and "DATA"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/bareword-filehandles"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "b-hooks-op-check-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IL/ILMARI/bareword-filehandles-0.003.tar.gz"

SRC_URI[md5sum] = "1e0ec0e72c897b238b4f9d0eb71643a4"
SRC_URI[sha256sum] = "be4334b476d6eead4d05b2e3587157c592470ef6dbff9298683ad7fee7a825fa"

S = "${WORKDIR}/bareword-filehandles-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
