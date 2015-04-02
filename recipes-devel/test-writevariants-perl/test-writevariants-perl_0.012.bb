DESCRIPTION = "NOTE: This is alpha code that's still evolving - nothing is stable."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-WriteVariants"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Test-WriteVariants-0.012.tar.gz"

SRC_URI[md5sum] = "5da2e8ec786448af84fce0d797194f72"
SRC_URI[sha256sum] = "49b46b705737897928a42f397ff5b18a9a85c9fe1a2579b0e82aab90389d4adc"
RDEPENDS_${PN} += "data-tumbler-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
DEPENDS += "test-directory-perl-native"
DEPENDS += "test-most-perl-native"

S = "${WORKDIR}/Test-WriteVariants-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
