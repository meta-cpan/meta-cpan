DESCRIPTION = "The functions exported by this module deal with runtime handling of \
Perl modules, which are normally handled at compile time. This module \
avoids \
using any other modules, so that it can be used in low-level \
infrastructure."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Runtime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Module-Runtime-0.014.tar.gz"

SRC_URI[md5sum] = "a6597bc25536a30476f0d75b64d35734"
SRC_URI[sha256sum] = "4c44fe0ea255a9fd00741ee545063f6692d2a28e7ef2fbaad1b24a92803362a4"

S = "${WORKDIR}/Module-Runtime-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
