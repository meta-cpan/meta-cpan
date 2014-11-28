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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Getopt-Long-Descriptive-0.098.tar.gz"

SRC_URI[md5sum] = "c6a8f5b8a3a1ddf80015aa6e302a50cc"
SRC_URI[sha256sum] = "aaa65b929eab8aed2cb95167ed2ffab3f46c54633b936fdade5231a8f1869722"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Getopt-Long-Descriptive-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
