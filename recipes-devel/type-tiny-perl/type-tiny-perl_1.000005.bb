DESCRIPTION = "Type::Tiny is a tiny class for creating Moose-like type constraint \
objects which are compatible with Moo, Moose and Mouse."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r1"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-1.000005.tar.gz"

SRC_URI[md5sum] = "2914b0e6b35c35f657d426fba29b4520"
SRC_URI[sha256sum] = "42ed36c011825aa1e6995a4e8638621a1b2103a0970b15764ca3919368042365"
RDEPENDS_${PN} += "exporter-tiny-perl"
RRECOMMENDS_${PN} += "devel-lexalias-perl"
RRECOMMENDS_${PN} += "devel-stacktrace-perl"
RRECOMMENDS_${PN} += "sub-name-perl"
RRECOMMENDS_${PN} += "type-tie-perl"
RRECOMMENDS_${PN} += "type-tiny-xs-perl"
RECOMMENDS += "test-simple-perl-native"
RECOMMENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Type-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
