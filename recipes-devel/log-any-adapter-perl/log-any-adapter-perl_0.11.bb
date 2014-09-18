DESCRIPTION = "The \"Log-Any-Adapter\" distribution implements Log::Any class methods \
to specify where logs should be sent. It is a separate distribution so \
as to \
keep \"Log::Any\" itself as simple and unchanging as possible."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any-Adapter"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JS/JSWARTZ/Log-Any-Adapter-0.11.tar.gz"

SRC_URI[md5sum] = "53ddc8bd4998cdb0ba0a49516a0e089c"
SRC_URI[sha256sum] = "9ebb9969b7efbc68de1e829e42cca2486d97a574d586f86bcb4d83ecff6ae66e"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "devel-globaldestruction-perl"
RDEPENDS_${PN} += "log-any-perl"

S = "${WORKDIR}/Log-Any-Adapter-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
