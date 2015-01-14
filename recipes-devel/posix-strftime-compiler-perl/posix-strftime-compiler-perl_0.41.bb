DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible \
strftime(3). But this module will not affected by the system locale. \
This feature is useful \
when you want to write loggers, servers and portable applications."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/POSIX-strftime-Compiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/POSIX-strftime-Compiler-0.41.tar.gz"

SRC_URI[md5sum] = "3cb849778e00f5d3894e7e78c2e629ce"
SRC_URI[sha256sum] = "670b89e11500f3808c9e21b1c300089622f68906ff12b1cbfba8e30d3a1c3739"
DEPENDS += "perl"

S = "${WORKDIR}/POSIX-strftime-Compiler-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
