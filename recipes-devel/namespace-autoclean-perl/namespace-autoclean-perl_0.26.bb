DESCRIPTION = "When you import a function into a Perl package, it will naturally also \
be available as a method."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/namespace-autoclean"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/namespace-autoclean-0.26.tar.gz"

SRC_URI[md5sum] = "1fb1238dc3164a83b36779b8fb02431f"
SRC_URI[sha256sum] = "c0f805acd3b565c611324b7bde20d32f6ffc31afefc5b8e52f54994802594d43"
RDEPENDS_${PN} += "b-hooks-endofscope-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "sub-identify-perl"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/namespace-autoclean-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
