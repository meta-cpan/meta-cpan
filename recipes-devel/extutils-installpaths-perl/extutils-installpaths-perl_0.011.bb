DESCRIPTION = "This module tries to make install path resolution as easy as possible."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-InstallPaths"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-InstallPaths-0.011.tar.gz"

SRC_URI[md5sum] = "9c75894c3c8c899ab6bfafc5eaa97999"
SRC_URI[sha256sum] = "7609fa048cdcf1451cad5b1d7d494f30e3d5bad0672d15404f1ea60e1df0067c"
RDEPENDS_${PN} += "extutils-config-perl"

S = "${WORKDIR}/ExtUtils-InstallPaths-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
