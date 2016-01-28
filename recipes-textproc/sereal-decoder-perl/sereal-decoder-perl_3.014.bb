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

SRC_URI = "https://cpan.metacpan.org/authors/id/Y/YV/YVES/Sereal-Decoder-3.014.tar.gz"

SRC_URI[md5sum] = "d52fb4fbd28acba055e9907bcbc99b47"
SRC_URI[sha256sum] = "123cf353865549f7c9e87905c401f68e446fd201a7369d00031122db269dc878"
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
