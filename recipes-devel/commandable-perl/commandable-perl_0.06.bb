DESCRIPTION = "This distribution contains a collection of utilities extracted from various \
commandline-based programs I have written, in the hope of trying to find a \
standard base to build these from in future."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Commandable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Commandable-0.06.tar.gz"

SRC_URI[md5sum] = "e465b003270cbc13c735b2dc08726d40"
SRC_URI[sha256sum] = "ecc16b44598c4bd81013d0e74d195b7cd9c344f2fa5d1637819be23b756a1da1"
RDEPENDS:${PN} += "module-pluggable-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Commandable-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
