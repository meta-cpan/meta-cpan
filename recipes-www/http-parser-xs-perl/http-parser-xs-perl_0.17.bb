DESCRIPTION = "HTTP::Parser::XS is a fast, primitive HTTP request/response parser."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Parser-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZUHO/HTTP-Parser-XS-0.17.tar.gz"

SRC_URI[md5sum] = "148579affbdfee247c47460924d6833d"
SRC_URI[sha256sum] = "794e6833e326b10d24369f9cdbfc1667105ef6591e8f41e561a3d41a7027a809"

S = "${WORKDIR}/HTTP-Parser-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
