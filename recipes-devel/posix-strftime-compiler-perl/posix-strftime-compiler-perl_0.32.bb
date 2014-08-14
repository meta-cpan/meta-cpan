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

SRC_URI = "http://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/POSIX-strftime-Compiler-0.32.tar.gz"

SRC_URI[md5sum] = "5c73330baf3648c1aae63c0255c04fb0"
SRC_URI[sha256sum] = "3bc5780f6057f4afb15c58d36846590ab6c1be7535e50890fd24b2c3f9a515d4"
DEPENDS += "perl"

S = "${WORKDIR}/POSIX-strftime-Compiler-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
