DESCRIPTION = "This module optimizes Moo type checks when used with Type::Tiny to perform \
better. It will automatically apply to isa checks and coercions that use \
Type::Tiny. Non-Type::Tiny isa checks will work as normal."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-TypeTiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/MooX-TypeTiny-0.001003.tar.gz"

SRC_URI[md5sum] = "55788c47b7363393b957abc8a7b2f11b"
SRC_URI[sha256sum] = "9a48623752188d1ff81c79f07c75e3cb471667c2f2139911e769f7d0b3760055"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "type-tiny-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/MooX-TypeTiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
