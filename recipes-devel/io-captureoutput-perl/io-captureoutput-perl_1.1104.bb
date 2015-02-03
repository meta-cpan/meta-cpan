DESCRIPTION = "This module is no longer recommended by the maintainer - see \
Capture::Tiny instead."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-CaptureOutput"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/IO-CaptureOutput-1.1104.tar.gz"

SRC_URI[md5sum] = "5c98f4ed8e6aa5237e610b5865f275e9"
SRC_URI[sha256sum] = "fcc732fcb438f97a72b30e8c7796484bef2562e374553b207028e2fbf73f8330"

S = "${WORKDIR}/IO-CaptureOutput-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
