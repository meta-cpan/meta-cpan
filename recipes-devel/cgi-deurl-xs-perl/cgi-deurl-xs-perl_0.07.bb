DESCRIPTION = "This module decodes a URL-encoded parameter string in the manner of \
CGI.pm. However, as it uses C code from libapreq to perform the task, \
it's somewhere from slightly to much faster (depending on your strings) \
than using CGI or a functionally similar module like CGI::Deurl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CGI-Deurl-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AT/ATHOMASON/CGI-Deurl-XS-0.07.tar.gz"

SRC_URI[md5sum] = "5692438b5fe015d214d9dca6e4c98811"
SRC_URI[sha256sum] = "2a11df18781c18081784cada4eeface010ef317a8505901e2b8a01ba76dbb46a"

S = "${WORKDIR}/CGI-Deurl-XS-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
