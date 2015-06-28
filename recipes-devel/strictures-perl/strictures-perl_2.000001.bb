DESCRIPTION = "I've been writing the equivalent of this module at the top of my code \
for about a year now. I figured it was time to make it shorter."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/strictures"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/strictures-2.000001.tar.gz"

SRC_URI[md5sum] = "fb1350b4af50a2f6ba053c1cfd97e920"
SRC_URI[sha256sum] = "1e738a8ad63ce8c9b447111c8304ae124a3277c2dc17953b4f647581525e20d3"
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
