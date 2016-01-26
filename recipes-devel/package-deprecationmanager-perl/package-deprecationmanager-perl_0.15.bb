DESCRIPTION = "This module allows you to manage a set of deprecations for one or more \
modules."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-DeprecationManager"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Package-DeprecationManager-0.15.tar.gz"

SRC_URI[md5sum] = "121b7ab5aa5fe06f79670f4bb78c808e"
SRC_URI[sha256sum] = "65c871f00849ba6a3369b3e4a5f206504e51bfb8eb2d2631fe2e18483fc29d61"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "sub-install-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Package-DeprecationManager-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
