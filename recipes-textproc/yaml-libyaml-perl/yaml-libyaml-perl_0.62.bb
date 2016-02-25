DESCRIPTION = "Kirill Siminov's "libyaml" is arguably the best YAML implementation. \
The C library is written precisely to the YAML 1.1 specification. It \
was originally bound to Python and was later bound to Ruby."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

PARALLEL_MAKE = " "

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/YAML-LibYAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-LibYAML-0.62.tar.gz"

SRC_URI[md5sum] = "e8e0ba8c9f589c809ee04bb526ae03d7"
SRC_URI[sha256sum] = "1a334a7ea9fe444ddb384a378b9f6eb2b77f4564fe481a778b48fb48b82d31db"

S = "${WORKDIR}/YAML-LibYAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
