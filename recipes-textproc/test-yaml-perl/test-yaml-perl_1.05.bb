DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IN/INGY/Test-YAML-1.05.tar.gz"

SRC_URI[md5sum] = "3ff2666f885568d14b3f4500426cee02"
SRC_URI[sha256sum] = "9309f4b0d8a1df5632a6e31b9992b1d4b9b69201d90b8db6e44e5c079857361d"

S = "${WORKDIR}/Test-YAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
