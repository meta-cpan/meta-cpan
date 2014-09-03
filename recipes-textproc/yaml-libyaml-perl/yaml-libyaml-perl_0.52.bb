DESCRIPTION = "Kirill Siminov's \"libyaml\" is arguably the best YAML implementation. \
The C library is written precisely to the YAML 1.1 specification. It \
was \
originally bound to Python and was later bound to Ruby."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML-LibYAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IN/INGY/YAML-LibYAML-0.52.tar.gz"

SRC_URI[md5sum] = "3f7fe918153c84e6947e0be5d838e9b1"
SRC_URI[sha256sum] = "06c1b162c06ca6b7f76f7e86e3eb0f3b03870d43d2fa88c6975e8bb89c960a93"

S = "${WORKDIR}/YAML-LibYAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
