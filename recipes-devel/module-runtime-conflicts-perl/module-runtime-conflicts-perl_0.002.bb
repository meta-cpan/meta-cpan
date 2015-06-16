DESCRIPTION = "This module provides conflicts checking for Module::Runtime, which had \
a recent release that broke some versions of Moose. It is called from \
Moose::Conflicts and \"moose-outdated\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Runtime-Conflicts"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Module-Runtime-Conflicts-0.002.tar.gz"

SRC_URI[md5sum] = "6171a55eb2937b4429bed8dfd75080a9"
SRC_URI[sha256sum] = "f8a98bd53ddcc56baba85400b0bc6b5723ec3369386e06f242dffa88eff4e480"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-runtime-perl"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/Module-Runtime-Conflicts-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
