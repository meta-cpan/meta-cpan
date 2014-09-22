DESCRIPTION = "This module lets you defer actions *at run-time* that will take place \
when the control flow returns into an upper scope. Currently, you can:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scope-Upper"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/V/VP/VPIT/Scope-Upper-0.25.tar.gz"

SRC_URI[md5sum] = "5bbb92a8a63689e81efed1460ab6a13d"
SRC_URI[sha256sum] = "dcd956aa221167b6996797dde6ec8a0ed57a7246b27e50595dd55a2f3895d756"

S = "${WORKDIR}/Scope-Upper-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
