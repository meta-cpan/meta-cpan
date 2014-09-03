DESCRIPTION = "This module is an extremely light-weight subset of Moose optimised for \
rapid startup and \"pay only for what you use\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/H/HA/HAARG/Moo-1.006000.tar.gz"

SRC_URI[md5sum] = "e0c1a34729b86a04edd756736e64a37d"
SRC_URI[sha256sum] = "2774054f30a2c9d1c90d23c1de2fe958e64642bf940bbca2e4ac08f47d33503e"
RDEPENDS_${PN} += "class-method-modifiers-perl"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "import-into-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "role-tiny-perl"
RDEPENDS_${PN} += "strictures-perl"
RRECOMMENDS_${PN} += "class-xsaccessor-perl"
RRECOMMENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"
RECOMMENDS += "perl"

S = "${WORKDIR}/Moo-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
