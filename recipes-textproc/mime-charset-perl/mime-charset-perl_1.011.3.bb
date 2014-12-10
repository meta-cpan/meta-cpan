DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Charset"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEZUMI/MIME-Charset-1.011.3.tar.gz"

SRC_URI[md5sum] = "962f6c962b238d34c1cc0f52efc21b24"
SRC_URI[sha256sum] = "b3a0542b1aacf74ca3f787e00d28a8b3e3a162486213d141657e1ee4fa4ff1e7"

S = "${WORKDIR}/MIME-Charset-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
