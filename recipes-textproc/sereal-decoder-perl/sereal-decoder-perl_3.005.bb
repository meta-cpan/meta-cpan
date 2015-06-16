DESCRIPTION = "This library implements a deserializer for an efficient, \
compact-output, and feature-rich binary protocol called *Sereal*. Its \
sister module \
Sereal::Encoder implements an encoder for this format. The two are \
released \
separately to allow for independent and safer upgrading."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sereal-Decoder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Decoder-3.005.tar.gz"

SRC_URI[md5sum] = "21ebee822c1f470629e3bd844c4ecc6f"
SRC_URI[sha256sum] = "9de58131c6bf12f22366cf50b09c58ac3d2771489c202255a24fffab0bde0930"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "test-longstring-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Sereal-Decoder-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
