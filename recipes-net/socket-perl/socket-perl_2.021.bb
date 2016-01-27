DESCRIPTION = "This module provides a variety of constants, structure manipulators and \
other functions related to socket-based networking. The values and \
functions provided are useful when used in conjunction with Perl core \
functions such as socket(), setsockopt() and bind(). It also provides \
several other support functions, mostly for dealing with conversions of \
network addresses between human-readable and native binary forms, and for \
hostname resolver operations."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Socket"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Socket-2.021.tar.gz"

SRC_URI[md5sum] = "a9b64847ec6d626a1b3ad46b16adb1e4"
SRC_URI[sha256sum] = "1ef59ca106b7ed3b3481266fe8d98ecc94790dd87f35aa09b8a09202eb01a5ec"

S = "${WORKDIR}/Socket-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
