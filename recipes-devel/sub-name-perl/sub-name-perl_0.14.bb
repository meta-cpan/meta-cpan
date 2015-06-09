DESCRIPTION = "This module has only one function, which is also exported by default:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Name"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Sub-Name-0.14.tar.gz"

SRC_URI[md5sum] = "211ca38767145b6c362da3b821a5abca"
SRC_URI[sha256sum] = "9276412677b445e7e9bdf6ab3a034a05a860e5c5dc560dd9272967745eeb3f17"

S = "${WORKDIR}/Sub-Name-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
