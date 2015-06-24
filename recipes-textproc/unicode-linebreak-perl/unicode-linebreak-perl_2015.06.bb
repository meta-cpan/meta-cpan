DESCRIPTION = "Unicode::LineBreak performs Line Breaking Algorithm described in \
Unicode Standard Annex \#14 [UAX \#14]. East_Asian_Width informative \
property defined by Annex \#11 [UAX \#11] will be concerned to determine \
breaking positions."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unicode-LineBreak"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEZUMI/Unicode-LineBreak-2015.06.tar.gz"

SRC_URI[md5sum] = "a4088bdf6be0b5eed24a0860aaf69467"
SRC_URI[sha256sum] = "4ecea8c87f35dff9e0281c846e3d5140d5323b64b5dc2c8f0d36020354e03881"
RDEPENDS_${PN} += "mime-charset-perl"

S = "${WORKDIR}/Unicode-LineBreak-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
