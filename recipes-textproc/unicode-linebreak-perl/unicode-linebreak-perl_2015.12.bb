DESCRIPTION = "Unicode::LineBreak performs Line Breaking Algorithm described in Unicode \
Standard Annex #14 [UAX #14]. East_Asian_Width informative property defined \
by Annex #11 [UAX #11] will be concerned to determine breaking positions."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Unicode-LineBreak"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEZUMI/Unicode-LineBreak-2015.12.tar.gz"

SRC_URI[md5sum] = "44d8d9291f90fb8c3359d37fcf00bee5"
SRC_URI[sha256sum] = "9509114ee76ecd6e2990d9ad7f260a81292804de54acd1c852d7e57812b316b4"
RDEPENDS_${PN} += "mime-charset-perl"

S = "${WORKDIR}/Unicode-LineBreak-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
