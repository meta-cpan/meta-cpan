DESCRIPTION = "Text::LineFold folds or unfolds lines of plain text. As it mainly \
focuses on plain text e-mail messages, RFC 3676 flowed format is also \
supported."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unicode-LineBreak"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/N/NE/NEZUMI/Unicode-LineBreak-2014.06.tar.gz"

SRC_URI[md5sum] = "c908890e6a00f4203da5d4a5d6060586"
SRC_URI[sha256sum] = "5c06dfb5036bbcc1043b366df48fd3a993a6cfaa1c2c5b4efd2b0d87fec54f8d"
RDEPENDS_${PN} += "mime-charset-perl"

S = "${WORKDIR}/Unicode-LineBreak-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
