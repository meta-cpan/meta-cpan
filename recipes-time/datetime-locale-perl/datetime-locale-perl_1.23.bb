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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-1.23.tar.gz"

SRC_URI[md5sum] = "f68544dfc0fe7231a8af72b75b0cbdd2"
SRC_URI[sha256sum] = "3a5a81e742da96d89b408e40f8bf4b21150663d8a5eb9dad7865db582193c015"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "scalar-list-utils-perl"
RDEPENDS_${PN} += "specio-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "ipc-system-simple-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-file-sharedir-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
