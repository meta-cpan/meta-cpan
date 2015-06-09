DESCRIPTION = "This Module is intended to provide an interface to the strongest \
available source of non-blocking randomness on the current platform. \
Platforms \
currently supported are anything supporting /dev/urandom and versions \
of \
Windows greater than or equal to Windows 2000."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-URandom"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DD/DDICK/Crypt-URandom-0.36.tar.gz"

SRC_URI[md5sum] = "d19cdb64e3db13fdf32542c51eaaa79c"
SRC_URI[sha256sum] = "81fec9921adc5d3c91cbe0ad8cb2bb89b045c4fb0de9cb3c43f17e58e477f8a1"

S = "${WORKDIR}/Crypt-URandom-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
