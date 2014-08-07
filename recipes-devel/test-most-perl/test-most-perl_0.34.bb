DESCRIPTION = "Test::Most exists to reduce boilerplate and to make your testing life \
easier. We provide "one stop shopping" for most commonly used testing \
modules. In fact, we often require the latest versions so that you get \
bug fixes through Test::Most and don't have to keep upgrading these modules \
separately."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Most"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "exception-class-perl"
DEPENDS += "test-deep-perl"
DEPENDS += "test-differences-perl"
DEPENDS += "test-exception-perl"
DEPENDS += "test-warn-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/O/OV/OVID/Test-Most-0.34.tar.gz"

SRC_URI[md5sum] = "6fa1f097bedbc18f46b08ac9eb79bba9"
SRC_URI[sha256sum] = "c2820c8de65f5fa59f218ac2be9be98b22cc1bb1a1f371e04375aa3b6054e244"

S = "${WORKDIR}/Test-Most-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
