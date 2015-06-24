DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object \
are present."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CPAN-Meta-Check"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/CPAN-Meta-Check-0.012.tar.gz"

SRC_URI[md5sum] = "adb415398390e83f09e4b91f73a6fd7f"
SRC_URI[sha256sum] = "4b4cd9a2ac788456fb43f32e40a380cb29122bb3b4082c70a008366d2881d5e7"
RDEPENDS_${PN} += "perl"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/CPAN-Meta-Check-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
