DESCRIPTION = "Kirill Siminov's "libyaml" is arguably the best YAML implementation. The C \
library is written precisely to the YAML 1.1 specification. It was \
originally bound to Python and was later bound to Ruby."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

PARALLEL_MAKE = " "

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML-LibYAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-LibYAML-0.69.tar.gz"

SRC_URI[md5sum] = "454856b96eb2107ed49dd96ceb358e03"
SRC_URI[sha256sum] = "6348ba03ff04d22330f05397d55ed26d4e40e921efcc207fa15fcbba87dcba1a"

S = "${WORKDIR}/YAML-LibYAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
