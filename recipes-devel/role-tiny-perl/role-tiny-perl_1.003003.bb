DESCRIPTION = ""Role::Tiny\" is a minimalist role composition tool."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Role-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/H/HA/HAARG/Role-Tiny-1.003003.tar.gz"

SRC_URI[md5sum] = "f8c04c43b28824589f560d029e497119"
SRC_URI[sha256sum] = "b712cadb6eecb7777278be79b5ffc55b613c0e75b9872dba474179cbc91b02cd"
RRECOMMENDS_${PV} += "class-method-modifiers-perl"
DEPENDS += "test-fatal-perl"

S = "${WORKDIR}/Role-Tiny-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
