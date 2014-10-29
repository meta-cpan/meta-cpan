DESCRIPTION = "This module is no longer recommended by the maintainer - see \
Capture::Tiny instead."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-CaptureOutput"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/IO-CaptureOutput-1.1103.tar.gz"

SRC_URI[md5sum] = "687965a287c0d741f979ba01e9bf1cd6"
SRC_URI[sha256sum] = "a5826b36440b2f5c850213129aa607eccb366c4f016b0dcd527f697fd03d94ad"

S = "${WORKDIR}/IO-CaptureOutput-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
