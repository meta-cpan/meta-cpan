DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Apache-LogFormat-Compiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Apache-LogFormat-Compiler-0.32.tar.gz"

SRC_URI[md5sum] = "0abb3275f934c7ac41d7a83c7d0565ad"
SRC_URI[sha256sum] = "bc112cdbc32f2e93c10bf661f39de509036e01c20c3a702a22cdb0be4426dd7f"
RDEPENDS_${PV} += "posix-strftime-compiler-perl"
DEPENDS += "http-message-perl"
DEPENDS += "liburi-perl"
DEPENDS += "perl"
DEPENDS += "test-mocktime-perl"
DEPENDS += "test-requires-perl"
DEPENDS += "try-tiny-perl"

S = "${WORKDIR}/Apache-LogFormat-Compiler-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
