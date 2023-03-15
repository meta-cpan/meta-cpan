DESCRIPTION = "This module optimizes Moo type checks when used with Type::Tiny to perform \
better. It will automatically apply to isa checks and coercions that use \
Type::Tiny. Non-Type::Tiny isa checks will work as normal."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-TypeTiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/MooX-TypeTiny-0.002003.tar.gz"

SRC_URI[md5sum] = "11d27986dff550f2e2cdb9d3a6c26469"
SRC_URI[sha256sum] = "d81e26ff6f8db10261f0087f96dc54367dcb49a9f3de8d53238f834ece19624b"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "type-tiny-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/MooX-TypeTiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
