DESCRIPTION = ""Role::Tiny\" is a minimalist role composition tool."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Role-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Role-Tiny-2.000000.tar.gz"

SRC_URI[md5sum] = "1005f7d427590aac51b1e734b8a2febc"
SRC_URI[sha256sum] = "a5f461e79d9433745807614c3be94f070375a0d4ed277189752fd0fecfe06091"
RRECOMMENDS_${PN} += "class-method-modifiers-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Role-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
