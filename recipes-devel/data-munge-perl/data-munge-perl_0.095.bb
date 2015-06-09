DESCRIPTION = "This module defines a few generally useful utility functions. I got \
tired of redefining or working around them, so I wrote this module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Munge"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAUKE/Data-Munge-0.095.tar.gz"

SRC_URI[md5sum] = "a88cce67b966b359e2840cb0f4140088"
SRC_URI[sha256sum] = "2e635a6ce9566a4ecee9c7eec774bc44ded9cf3f9c46fb6e12ddad4950805354"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Data-Munge-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
