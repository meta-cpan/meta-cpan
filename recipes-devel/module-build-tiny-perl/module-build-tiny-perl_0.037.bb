DESCRIPTION = "Many Perl distributions use a Build.PL file instead of a Makefile.PL \
file to drive distribution configuration, build, test and installation. \
Traditionally, Build.PL uses Module::Build as the underlying build \
system. \
This module provides a simple, lightweight, drop-in replacement."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-Tiny-0.037.tar.gz"

SRC_URI[md5sum] = "d1449ad9e7039407bd3edf632b115849"
SRC_URI[sha256sum] = "25dd7246b071d7a4e62a410ca3fc18c3e2cfb82440324fa97d472b493dd60ec0"
RDEPENDS_${PN} += "extutils-config-perl"
RDEPENDS_${PN} += "extutils-helpers-perl"
RDEPENDS_${PN} += "extutils-installpaths-perl"
DEPENDS += "extutils-config-perl-native"
DEPENDS += "extutils-helpers-perl-native"
DEPENDS += "extutils-installpaths-perl-native"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
