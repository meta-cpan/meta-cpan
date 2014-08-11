DESCRIPTION = "Getopt::Long::Descriptive is yet another Getopt library. It's built \
atop Getopt::Long, and gets a lot of its features, but tries to avoid \
making you \
think about its huge array of options."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Getopt-Long-Descriptive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Getopt-Long-Descriptive-0.097.tar.gz"

SRC_URI[md5sum] = "b349698c5addd07a8355a8ee56891bf4"
SRC_URI[sha256sum] = "a6e484962727ae2d882d5d35c5bedd48bc13730a7e4c739a7daa74f525422883"
RDEPENDS_${PV} += "params-validate-perl"
RDEPENDS_${PV} += "sub-exporter-perl"
DEPENDS += "test-fatal-perl"
DEPENDS += "test-warnings-perl"

S = "${WORKDIR}/Getopt-Long-Descriptive-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
