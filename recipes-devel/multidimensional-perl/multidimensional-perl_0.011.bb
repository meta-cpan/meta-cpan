DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you \
when \
you typo a hash slice by using the \"$\" sigil instead of \"@\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/multidimensional"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IL/ILMARI/multidimensional-0.011.tar.gz"

SRC_URI[md5sum] = "f1f75d5b65d16f73a4c145707b9ff2e6"
SRC_URI[sha256sum] = "aa46d31355deed8969eb82126afdc9330f6caad17dca18f651f5ae55b9165d6a"
RDEPENDS_${PN} += "b-hooks-op-check-perl"
RDEPENDS_${PN} += "lexical-sealrequirehints-perl"
DEPENDS += "extutils-depends-perl-native"
DEPENDS += "b-hooks-op-check-perl-native"

S = "${WORKDIR}/multidimensional-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
