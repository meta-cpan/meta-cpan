DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% \
of the testing you will need to do for scripts in the script (or bin as \
is also \
commonly used) paths of your Perl distribution."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Script"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "ipc-run3-perl"
DEPENDS += "probe-perl-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Test-Script-1.07.tar.gz"

SRC_URI[md5sum] = "f6b5baa6403cd24dac7f023e0ea22384"
SRC_URI[sha256sum] = "e21e5ee43a27b4c51b54ded5c92e60b817309778117a1d98ae6354abff27eb96"

S = "${WORKDIR}/Test-Script-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
