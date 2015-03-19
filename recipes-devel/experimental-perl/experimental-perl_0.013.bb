DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/experimental"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/experimental-0.013.tar.gz"

SRC_URI[md5sum] = "31173b72bcebf38c4937388a657d2e25"
SRC_URI[sha256sum] = "409f8dc93d26c2abfc5877ed2efb30eaf4e55dab5baddcae78e2f70cd3e822ea"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/experimental-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
