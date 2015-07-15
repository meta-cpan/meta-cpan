DESCRIPTION = "Cookie::Baker::XS provides cookie string parser that implemented by XS. \
This modules only provides parser, does not have a generator function."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-XS-0.06.tar.gz"

SRC_URI[md5sum] = "bfe6557f037456fe5ac8d1a21c080338"
SRC_URI[sha256sum] = "e26eb3e9db7846d5d47f3f7e43ffeaa15b4d73a61adc8f57d57f46f3db35c970"

S = "${WORKDIR}/Cookie-Baker-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
