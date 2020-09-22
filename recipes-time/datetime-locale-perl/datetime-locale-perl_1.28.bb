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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-1.28.tar.gz"

SRC_URI[md5sum] = "6ae492b6efc110d15dd43af8862126ae"
SRC_URI[sha256sum] = "6c604d8c5c9c2739b78e0538a402283b82b1df419e60bef20b04843e4584bade"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "specio-perl"
RDEPENDS_${PN} += "scalar-list-utils-perl"
RDEPENDS_${PN}-dev += "dist-checkconflicts-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "file-sharedir-install-perl-native"
DEPENDS += "ipc-system-simple-perl-native"
DEPENDS += "path-tiny-perl-native"
DEPENDS += "test-file-sharedir-perl-native"
DEPENDS += "test2-plugin-nowarnings-perl-native"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"

FILES_${PN}-dev += "${PERLLIBDIRS}/vendor_perl/${PERLVERSION}/DateTime/Locale/Conflicts.pm"
