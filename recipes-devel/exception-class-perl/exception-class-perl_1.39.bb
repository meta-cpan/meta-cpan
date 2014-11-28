DESCRIPTION = "RECOMMENDATION 1: If you are writing modern Perl code with Moose or Moo \
I highly recommend using Throwable instead of this module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exception-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-1.39.tar.gz"

SRC_URI[md5sum] = "971b6e47d18419bf1f8f0419ace2348c"
SRC_URI[sha256sum] = "819c756a69a6d1e31f396eca6a508b07b0a522a035b904cd1d432353cc362083"
RDEPENDS_${PN} += "class-data-inheritable-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
