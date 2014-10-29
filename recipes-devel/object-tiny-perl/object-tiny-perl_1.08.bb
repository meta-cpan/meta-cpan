DESCRIPTION = "There's a whole bunch of class builders out there. In fact, creating a \
class builder seems to be something of a rite of passage (this is my \
fifth, at \
least)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Object-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/Object-Tiny-1.08.tar.gz"

SRC_URI[md5sum] = "01faa01e179ea95ec9e792dd0ead64f0"
SRC_URI[sha256sum] = "b1d6058ce377b74a21f888008ad65aa17427dbec46c9aad3ba1c3fd93864de56"

S = "${WORKDIR}/Object-Tiny-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
