DESCRIPTION = "The \"Encode\" module provides the interface between Perl strings and \
the rest of the system. Perl strings are sequences of *characters*."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-2.74.tar.gz"

SRC_URI[md5sum] = "1ae3b5db831c024c00e6e28b550b873d"
SRC_URI[sha256sum] = "aa3c832a0478dae1da4e4ac8b12de0d2460c95964ae5d600f6af12f5c9afa6c0"

S = "${WORKDIR}/Encode-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

inherit update-alternatives

ALTERNATIVE_PRIORITY = "100"

ALTERNATIVE_${PN} = "piconv enc2xs"
ALTERNATIVE_LINK_NAME[piconv] = "${bindir}/piconv"
ALTERNATIVE_LINK_NAME[enc2xs] = "${bindir}/enc2xs"

BBCLASSEXTEND = "native"
