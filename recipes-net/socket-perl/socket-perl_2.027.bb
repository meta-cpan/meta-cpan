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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Socket-2.027.tar.gz"

SRC_URI[md5sum] = "8741e7a55272f5db80c520be43a725a1"
SRC_URI[sha256sum] = "141c11494d171c13765d972417be731388f6372ffaad619cfc72998e972be2a8"

S = "${WORKDIR}/Socket-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
