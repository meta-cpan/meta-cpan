DESCRIPTION = "This module allows you to manage a set of deprecations for one or more \
modules."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-DeprecationManager"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Package-DeprecationManager-0.17.tar.gz"

SRC_URI[md5sum] = "7b46e92aaae3047ede3c67c1714ab88e"
SRC_URI[sha256sum] = "1d743ada482b5c9871d894966e87d4c20edc96931bb949fb2638b000ddd6684b"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "params-util-perl"
RDEPENDS_${PN} += "sub-install-perl"
RDEPENDS_${PN} += "sub-name-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Package-DeprecationManager-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
