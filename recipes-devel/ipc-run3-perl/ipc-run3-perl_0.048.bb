DESCRIPTION = "This module allows you to run a subprocess and redirect stdin, stdout, \
and/or stderr to files and perl data structures. It aims to satisfy 99% \
of \
the need for using \"system\", \"qx\", and \"open3\" with a simple, \
extremely \
Perlish API."

SECTION = "libs"
LICENSE = "unknown(open_source)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IPC-Run3"

LIC_FILES_CHKSUM = "unknown(open_source)"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/IPC-Run3-0.048.tar.gz"

SRC_URI[md5sum] = "5a8cec571c51a118b265cf6e24e55761"
SRC_URI[sha256sum] = "3d81c3cc1b5cff69cca9361e2c6e38df0352251ae7b41e2ff3febc850e463565"

S = "${WORKDIR}/IPC-Run3-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
