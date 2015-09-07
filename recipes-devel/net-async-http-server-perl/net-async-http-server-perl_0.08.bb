DESCRIPTION = "This module allows a program to respond asynchronously to HTTP \
requests, as part of a program based on IO::Async. An object in this \
class listens on a \
single port and invokes the \"on_request\" callback or subclass method \
whenever an HTTP request is received, allowing the program to respond \
to it."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Async-HTTP-Server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Net-Async-HTTP-Server-0.08.tar.gz"

SRC_URI[md5sum] = "26265e4220848cebbddf2d5385ee8700"
SRC_URI[sha256sum] = "d4413febc8d6550b502c61d3c1c16225e9bf4edf698aaa01e2d1e95b312dc235"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "io-async-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Net-Async-HTTP-Server-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
