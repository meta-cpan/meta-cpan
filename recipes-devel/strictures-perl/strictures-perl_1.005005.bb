DESCRIPTION = "I've been writing the equivalent of this module at the top of my code \
for about a year now. I figured it was time to make it shorter."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/strictures"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/H/HA/HAARG/strictures-1.005005.tar.gz"

SRC_URI[md5sum] = "6600e27805eed1554984799ac8158410"
SRC_URI[sha256sum] = "a9fc369b711862d8bfd74e06002112d50ae207869d0c231d0d6cc99439dab7ae"
RRECOMMENDS_${PN} += "bareword-filehandles-perl"
RRECOMMENDS_${PN} += "indirect-perl"
RRECOMMENDS_${PN} += "multidimensional-perl"

S = "${WORKDIR}/strictures-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
