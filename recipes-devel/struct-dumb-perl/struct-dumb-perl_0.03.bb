DESCRIPTION = ""Struct::Dumb\" creates record-like structure types, similar to the \
\"struct\" keyword in C, C++ or C\#, or \"Record\" in Pascal. An \
invocation of this module \
will create a construction function which returns new object references \
with \
the given field values. These references all respond to lvalue methods \
that \
access or modify the values stored."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Struct-Dumb"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Struct-Dumb-0.03.tar.gz"

SRC_URI[md5sum] = "7b528d9ccd73545c76416d326230dc4e"
SRC_URI[sha256sum] = "5413ce5131a7c74539e752a77991075859c018ca5f25385a731efce1c40c5c58"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Struct-Dumb-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
