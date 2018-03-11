DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Locale"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-1.17.tar.gz"

SRC_URI[md5sum] = "15de4ed87a41c5c4da5290c73532cf7b"
SRC_URI[sha256sum] = "0ca6598b3f89e92e3d1140e5685c69f6f795f6eed158fa482f33ce2122b35cc9"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "specio-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-file-sharedir-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
