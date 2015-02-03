DESCRIPTION = "Like Tcl's uplevel() function, but not quite so dangerous. The idea is \
just to fool caller(). All the really naughty bits of Tcl's uplevel() \
are \
avoided."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Uplevel"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Sub-Uplevel-0.25.tar.gz"

SRC_URI[md5sum] = "5d0752dbfa94d0c91b25a264f47f5675"
SRC_URI[sha256sum] = "2dcca582a7ea5bada576eb27c4be1d1b064fb22175bdbd6d696c45d083560505"

S = "${WORKDIR}/Sub-Uplevel-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
