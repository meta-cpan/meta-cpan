DESCRIPTION = "This library implements a deserializer for an efficient, compact-output, \
and feature-rich binary protocol called *Sereal*. Its sister module \
Sereal::Encoder implements an encoder for this format. The two are released \
separately to allow for independent and safer upgrading."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sereal-Decoder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Decoder-4.005.tar.gz"

SRC_URI[md5sum] = "68a7a2220cc9d05585100e4eace9da9f"
SRC_URI[sha256sum] = "043adad093d1bfdea1e637e1a6fe598291da244d18213e9e5486e313f0c25e9f"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-differences-perl-native"
DEPENDS += "test-longstring-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Sereal-Decoder-${PV}"
PARALLEL_MAKE = " "

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
