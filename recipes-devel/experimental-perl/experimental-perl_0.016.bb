DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/experimental"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/experimental-0.016.tar.gz"

SRC_URI[md5sum] = "bf733d45db14cc55c19e41c95bf12098"
SRC_URI[sha256sum] = "f451d764057617b412a1cbd9ed66cac16d139d25ab156b05f370422371560480"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/experimental-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
