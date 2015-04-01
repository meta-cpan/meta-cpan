DESCRIPTION = "This module lets you defer actions *at run-time* that will take place \
when the control flow returns into an upper scope. Currently, you can:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scope-Upper"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/Scope-Upper-0.26.tar.gz"

SRC_URI[md5sum] = "1da9e90c8739eaf92790db7ba342b294"
SRC_URI[sha256sum] = "682b4c39065098ffd26ccfb2477734320184b9f480b8245daae2f81729eaa3f6"

S = "${WORKDIR}/Scope-Upper-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
