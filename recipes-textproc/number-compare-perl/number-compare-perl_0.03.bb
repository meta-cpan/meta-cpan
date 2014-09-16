DESCRIPTION = "Number::Compare compiles a simple comparison to an anonymous \
subroutine, which you can call with a value to be tested again."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Number-Compare"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Number-Compare-0.03.tar.gz"

SRC_URI[md5sum] = "ded4085a8fc96328742785574ca65208"
SRC_URI[sha256sum] = "83293737e803b43112830443fb5208ec5208a2e6ea512ed54ef8e4dd2b880827"

S = "${WORKDIR}/Number-Compare-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
