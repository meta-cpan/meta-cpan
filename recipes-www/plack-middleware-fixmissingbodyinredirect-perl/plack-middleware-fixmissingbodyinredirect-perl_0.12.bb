DESCRIPTION = "This module sets body in redirect response, if it's not already set."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack-Middleware-FixMissingBodyInRedirect"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SW/SWEETKID/Plack-Middleware-FixMissingBodyInRedirect-0.12.tar.gz"

SRC_URI[md5sum] = "f570ae069684cfafc099283801ad058d"
SRC_URI[sha256sum] = "6c22d069f5a57ac206d4659b28b8869bb9270640bb955efddd451dcc58cdb391"
RDEPENDS_${PN} += "html-parser-perl"
RDEPENDS_${PN} += "plack-perl"
DEPENDS += "http-message-perl-native"

S = "${WORKDIR}/Plack-Middleware-FixMissingBodyInRedirect-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
