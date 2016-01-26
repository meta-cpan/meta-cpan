DESCRIPTION = "PadWalker is a module which allows you to inspect (and even change!) \
lexical variables in any subroutine which called you. It will only show \
those variables which are in scope at the point of the call."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/PadWalker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RO/ROBIN/PadWalker-2.2.tar.gz"

SRC_URI[md5sum] = "6bcc741f77b1831a893b2a22c785e31a"
SRC_URI[sha256sum] = "fc1df2084522e29e892da393f3719d2c1be0da022fdd89cff4b814167aecfea3"

S = "${WORKDIR}/PadWalker-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
