DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Locale"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-1.33.tar.gz"

SRC_URI[md5sum] = "514dd9212d56577592ffd8d3119bee02"
SRC_URI[sha256sum] = "52bfefad9ff39c4d8fd1f5e78642e38b8dcd33363f337d8e89bf19e6ad185cb9"
RDEPENDS:${PN} += "dist-checkconflicts-perl"
RDEPENDS:${PN} += "file-sharedir-perl"
RDEPENDS:${PN} += "namespace-autoclean-perl"
RDEPENDS:${PN} += "params-validationcompiler-perl"
RDEPENDS:${PN} += "specio-perl"
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
