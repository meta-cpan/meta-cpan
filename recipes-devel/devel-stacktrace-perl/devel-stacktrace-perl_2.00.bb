DESCRIPTION = "The \"Devel::StackTrace\" module contains two classes, \
C,Devel::StackTrace> and Devel::StackTrace::Frame. These objects \
encapsulate the information that \
can retrieved via Perl's \"caller()\" function, as well as providing a \
simple \
interface to this data."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-StackTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-2.00.tar.gz"

SRC_URI[md5sum] = "826ed2bc7cdd8d852d7d2d8b69aa313c"
SRC_URI[sha256sum] = "1debe7273099a60e1386e0da5edbed7334db3cf3ed8e3b4106b087100b8ec5e4"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
