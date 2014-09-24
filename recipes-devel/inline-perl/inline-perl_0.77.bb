DESCRIPTION = "The Inline module allows you to put source code from other programming \
languages directly \"inline\" in a Perl script or module. The code is \
automatically compiled as needed, and then loaded for immediate access \
from \
Perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Inline"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IN/INGY/Inline-0.77.tar.gz"

SRC_URI[md5sum] = "8519c81a93e4a7ea374dc2c20ccb2666"
SRC_URI[sha256sum] = "8d5ec3bdf18930ec9dedbbbf949f468eef8142458bc57946b34c89aea3cabc2b"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Inline-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
