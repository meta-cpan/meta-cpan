DESCRIPTION = "When the code you're testing returns multiple lines, records or data \
structures and they're just plain wrong, an equivalent to the Unix \
\"diff\" \
utility may be just what's needed. Here's output from an example test \
script \
that checks two text documents and then two (trivial) data structures:"

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Differences"

LIC_FILES_CHKSUM = "unknown(unknown)"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Test-Differences-0.62.tar.gz"

SRC_URI[md5sum] = "3aa6f4d0c3550d50bfa71a80c28aabd3"
SRC_URI[sha256sum] = "b627194ca3cc3de282a46417e894239bc3ac3a814732af76112dc7cdfcf05075"
RDEPENDS_${PV} += "capture-tiny-perl"
RDEPENDS_${PV} += "text-diff-perl"

S = "${WORKDIR}/Test-Differences-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
