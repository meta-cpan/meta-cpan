DESCRIPTION = "caller_cv($level) gives you the coderef of the subroutine \
being invoked at the call frame indicated by the value of \$level"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Caller"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Devel-Caller-2.06.tar.gz"

SRC_URI[md5sum] = "af52f47979b3c9358af9e5d8c283f263"
SRC_URI[sha256sum] = "6a73ae6a292834255b90da9409205425305fcfe994b148dcb6d2d6ef628db7df"
RDEPENDS_${PN} += "padwalker-perl"

S = "${WORKDIR}/Devel-Caller-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
