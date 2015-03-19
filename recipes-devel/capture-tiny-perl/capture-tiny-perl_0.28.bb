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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Capture-Tiny-0.28.tar.gz"

SRC_URI[md5sum] = "2923ba0524f4f42a6022f3ef1ca1913d"
SRC_URI[sha256sum] = "e394caddb0e1a46e8cc4bf499eaae6c265dd201d34cac46d2f3e507c23afef84"

S = "${WORKDIR}/Capture-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
