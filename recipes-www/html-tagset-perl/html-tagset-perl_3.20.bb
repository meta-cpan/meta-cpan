DESCRIPTION = "This module contains several data tables useful in various kinds of \
HTML parsing operations."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTML-Tagset"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PETDANCE/HTML-Tagset-3.20.tar.gz"

SRC_URI[md5sum] = "d2bfa18fe1904df7f683e96611e87437"
SRC_URI[sha256sum] = "adb17dac9e36cd011f5243881c9739417fd102fce760f8de4e9be4c7131108e2"

S = "${WORKDIR}/HTML-Tagset-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
