DESCRIPTION = "This module provides a possibility to build your own set of Moose-like \
types. These custom types can then be used to describe fields in \
Moo-based \
classes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Types-MooseLike"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MATEU/MooX-Types-MooseLike-0.29.tar.gz"

SRC_URI[md5sum] = "0905b92c1b44578e05e7f08fa7adb9ee"
SRC_URI[sha256sum] = "1d3780aa9bea430afbe65aa8c76e718f1045ce788aadda4116f59d3b7a7ad2b4"
RDEPENDS_${PN} += "module-runtime-perl"
DEPENDS += "moo-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/MooX-Types-MooseLike-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
