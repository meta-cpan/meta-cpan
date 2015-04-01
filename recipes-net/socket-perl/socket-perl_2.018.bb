DESCRIPTION = "This module provides a variety of constants, structure manipulators and \
other functions related to socket-based networking. The values and functions \
provided are useful when used in conjunction with Perl core functions such \
as socket(), setsockopt() and bind(). It also provides several other support \
functions, mostly for dealing with conversions of network addresses between \
human-readable and native binary forms, and for hostname resolver operations."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Socket"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Socket-2.018.tar.gz"

SRC_URI[md5sum] = "d735fd2a339c4676e0e3733af327cc09"
SRC_URI[sha256sum] = "77c13e040b0f897dc89855318ca6435d2ded0fab190bf6b1e9a8a4d707c37a88"

S = "${WORKDIR}/Socket-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
