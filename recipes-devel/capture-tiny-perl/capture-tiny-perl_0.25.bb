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

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Capture-Tiny-0.25.tar.gz"

SRC_URI[md5sum] = "8cbf69b1ceb10899308ac1f57a28c8a8"
SRC_URI[sha256sum] = "577f88cfddf7707aad242c6b398a304d224433def2a16051f2d28a351558f489"
RECOMMENDS += "perl"

S = "${WORKDIR}/Capture-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
