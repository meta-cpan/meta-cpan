DESCRIPTION = "This module exports a single function: \"ttie\". \"ttie\" ties a \
variable to a type constraint, ensuring that whatever values stored in \
the variable will conform to the type constraint. If the type constraint \
has coercions, these will be used if necessary to ensure values assigned \
to the variable conform."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tie-0.009.tar.gz"

SRC_URI[md5sum] = "dffa70fba93148644165a6e97ecc2f47"
SRC_URI[sha256sum] = "565d9ec0a7f93095d5e68a8794a25c0b27e292007e04fdb77793f477da1463f3"
RDEPENDS_${PN} += "exporter-tiny-perl"
RRECOMMENDS_${PN} += "hash-fieldhash-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Type-Tie-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
