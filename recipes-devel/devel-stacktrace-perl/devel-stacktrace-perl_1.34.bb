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

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-1.34.tar.gz"

SRC_URI[md5sum] = "48c1003b3c380c8a826c042c80af9c49"
SRC_URI[sha256sum] = "e882ccd7f4cbab0d0cdad53897f3f3bf29bdcf47d2bdfde1ac07f1bc7d7ebd16"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
