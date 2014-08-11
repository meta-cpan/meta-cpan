DESCRIPTION = "Moo attributes (like Moose) have an 'isa' property. This module \
provides some basic types for this property. One can import all types \
with ':all' tag \
or import a list of types like:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Types-MooseLike"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MA/MATEU/MooX-Types-MooseLike-0.25.tar.gz"

SRC_URI[md5sum] = "9047d7c5336d2a46bf4d7b67c6f5e84a"
SRC_URI[sha256sum] = "33e26df9853ab429a2978d8131304b91b4baadce4b3a908863de44061e4b69c9"
RDEPENDS_${PV} += "module-runtime-perl"
DEPENDS += "moo-perl"
DEPENDS += "test-fatal-perl"

S = "${WORKDIR}/MooX-Types-MooseLike-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
