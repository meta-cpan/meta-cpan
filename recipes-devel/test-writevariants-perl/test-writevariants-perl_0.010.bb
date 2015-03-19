DESCRIPTION = "NOTE: This is alpha code that's still evolving - nothing is stable."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-WriteVariants"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Test-WriteVariants-0.010.tar.gz"

SRC_URI[md5sum] = "6ab662c1167604f073538a29becd8da3"
SRC_URI[sha256sum] = "99cb5fea486e8ecd1b46062d77bdf04ad61d3a4ddd79fb118e1e25e90ab8744e"
RDEPENDS_${PN} += "data-tumbler-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RRECOMMENDS_${PN} += "file-homedir-perl"
DEPENDS += "test-directory-perl-native"

S = "${WORKDIR}/Test-WriteVariants-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
