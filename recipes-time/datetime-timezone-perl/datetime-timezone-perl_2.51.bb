DESCRIPTION = "This class is the base class for all time zone objects. A time zone is \
represented internally as a set of observances, each of which describes the \
offset from GMT for a given time period."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-TimeZone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-TimeZone-2.51.tar.gz"

SRC_URI[md5sum] = "08ab4f384cf84e31481844608e40916b"
SRC_URI[sha256sum] = "e376b0fa34a31978a407e7bca4f8cf89fe86103e18d67c6f6f6ce72a5f1e6c6a"
RDEPENDS:${PN} += "class-singleton-perl"
RDEPENDS:${PN} += "module-runtime-perl"
RDEPENDS:${PN} += "namespace-autoclean-perl"
RDEPENDS:${PN} += "params-validationcompiler-perl"
RDEPENDS:${PN} += "specio-perl"
RDEPENDS:${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/DateTime-TimeZone-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
