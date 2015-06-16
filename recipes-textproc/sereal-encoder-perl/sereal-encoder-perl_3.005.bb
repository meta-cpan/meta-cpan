DESCRIPTION = "This library implements an efficient, compact-output, and feature-rich \
serializer using a binary protocol called *Sereal*. Its sister module \
Sereal::Decoder implements a decoder for this format. The two are \
released \
separately to allow for independent and safer upgrading. If you care \
greatly \
about performance, consider reading the Sereal::Performance \
documentation \
after finishing this document."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sereal-Encoder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Encoder-3.005.tar.gz"

SRC_URI[md5sum] = "a472e6ab83f0db2ef37d1efbc4cc9d34"
SRC_URI[sha256sum] = "4dac10c61e9ca8901b2a000a6d749a22b0ca0c0c262e07007201811e6b15da48"
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
