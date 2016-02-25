DESCRIPTION = "The "Encode" module provides the interface between Perl strings and the \
rest of the system. Perl strings are sequences of *characters*."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DANKOGAI/Encode-2.82.tar.gz"

SRC_URI[md5sum] = "5e36c5babb432536f90c51bcab733565"
SRC_URI[sha256sum] = "be818fc032b014eb209b9ef034bc9f1a6b506c12b2ba90285e8dbd1871904b30"

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
