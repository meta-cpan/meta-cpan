DESCRIPTION = ""Role::Tiny\" is a minimalist role composition tool."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Role-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Role-Tiny-1.003004.tar.gz"

SRC_URI[md5sum] = "3c405a0f76eab9893c8927baea0cdb0c"
SRC_URI[sha256sum] = "adba1919b5e9a47cc13df4496e72c14fdde228887a00c2a3ae3d023b1504662a"
RRECOMMENDS_${PN} += "class-method-modifiers-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Role-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
