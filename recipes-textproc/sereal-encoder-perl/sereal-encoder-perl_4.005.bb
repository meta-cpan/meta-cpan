DESCRIPTION = "This library implements an efficient, compact-output, and feature-rich \
serializer using a binary protocol called *Sereal*. Its sister module \
Sereal::Decoder implements a decoder for this format. The two are released \
separately to allow for independent and safer upgrading. If you care \
greatly about performance, consider reading the Sereal::Performance \
documentation after finishing this document."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sereal-Encoder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Encoder-4.005.tar.gz"

SRC_URI[md5sum] = "5af0152a2c7f13e7ae1d23952a55dd03"
SRC_URI[sha256sum] = "2950b328d69f262c6fba2350f8604744e54016ecfddc3d96b7d71dcc5b990b0a"
DEPENDS += "sereal-decoder-perl-native"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-differences-perl-native"
DEPENDS += "test-longstring-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Sereal-Encoder-${PV}"
PARALLEL_MAKE = " "

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
