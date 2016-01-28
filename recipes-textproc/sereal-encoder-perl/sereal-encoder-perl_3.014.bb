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

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Encoder-3.014.tar.gz"

SRC_URI[md5sum] = "260b60762618e39b0cc158c2815c663c"
SRC_URI[sha256sum] = "b8f43b56b538ea4fb16618beb5c1b70b645139c3d7da4e18c2fb1e93b454a34d"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "sereal-decoder-perl-native"
DEPENDS += "test-longstring-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Sereal-Encoder-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
