DESCRIPTION = "Kirill Siminov's \"libyaml\" is arguably the best YAML implementation. \
The C library is written precisely to the YAML 1.1 specification. It \
was \
originally bound to Python and was later bound to Ruby."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

PARALLEL_MAKE = " "

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML-LibYAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/YAML-LibYAML-0.55.tar.gz"

SRC_URI[md5sum] = "d48db921392b0ea6cf49fc0edebd0a3f"
SRC_URI[sha256sum] = "afedd4969428186bb8a8629efffc04fd7108ea5e2a32f8afb8d551a0e3502d37"

S = "${WORKDIR}/YAML-LibYAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
