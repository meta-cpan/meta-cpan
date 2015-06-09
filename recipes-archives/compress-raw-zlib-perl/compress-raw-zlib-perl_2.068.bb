DESCRIPTION = "The *Compress::Raw::Zlib* module provides a Perl interface to the \
*zlib* compression library (see \"AUTHOR\" for details about where to \
get *zlib*)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Compress-Raw-Zlib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Zlib-2.068.tar.gz"

SRC_URI[md5sum] = "5992c736ff448491c70100f88bb24114"
SRC_URI[sha256sum] = "11a553221e4dcee77211ac63484498df3831140be38a4ff62bd61af10eb2071b"
DEPENDS = "zlib perl"
RDEPENDS_${PN} += "zlib"

S = "${WORKDIR}/Compress-Raw-Zlib-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
