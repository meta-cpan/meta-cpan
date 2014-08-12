DESCRIPTION = "USING THE AppConfig MODULE To import and use the AppConfig module the \
following line should appear in \
your Perl script:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/AppConfig"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABW/AppConfig-1.66.tar.gz"

SRC_URI[md5sum] = "21aa4d1bf70a49a94c2dc9293389b3a0"
SRC_URI[sha256sum] = "8b402de20569e6499e55bd36bd2264d964a41218f75fde6ac29902d16fd23bdc"

S = "${WORKDIR}/AppConfig-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
