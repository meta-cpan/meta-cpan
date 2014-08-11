DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate \
Authority certificates in a form that can be consumed by modules and \
libraries based \
on OpenSSL."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "unknown(unknown)"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20130114.tar.gz"

SRC_URI[md5sum] = "45a42082dbd68cf25869ceb2aa49d5b2"
SRC_URI[sha256sum] = "82342614add1dbca8a00daa1ee55af3e0036245aed7d445537918c045008ccd7"

S = "${WORKDIR}/Mozilla-CA-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
