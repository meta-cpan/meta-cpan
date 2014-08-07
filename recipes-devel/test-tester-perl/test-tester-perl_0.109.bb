DESCRIPTION = "If you have written a test module based on Test::Builder then \
Test::Tester allows you to test it with the minimum of effort."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Tester"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/F/FD/FDALY/Test-Tester-0.109.tar.gz"

SRC_URI[md5sum] = "d8fd872ee7e959f89a4af0371a7e782d"
SRC_URI[sha256sum] = "d3c7c85e2fcbd5bb9c9c4d2e76ddaa9b1694ed0ab2795b722904cf043e123655"

S = "${WORKDIR}/Test-Tester-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
