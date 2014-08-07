DESCRIPTION = "Capture::Tiny provides a simple, portable way to capture almost \
anything sent to STDOUT or STDERR, regardless of whether it comes from \
Perl, from XS \
code or from an external program. Optionally, output can be teed so \
that it \
is captured while being passed through to the original filehandles. \
Yes, it \
even works on Windows (usually). Stop guessing which of a dozen \
capturing \
modules to use in any particular situation and just use this one."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Capture-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Capture-Tiny-0.24.tar.gz"

SRC_URI[md5sum] = "718e9d62c4a27a3207cf8506cb99d846"
SRC_URI[sha256sum] = "9bcf6f8472f8ea50401536cb070ac0c7770837d155c4d6abe212759863aae065"

S = "${WORKDIR}/Capture-Tiny-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
