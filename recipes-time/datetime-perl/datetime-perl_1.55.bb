DESCRIPTION = "DateTime is a class for the representation of date/time combinations, and \
is part of the Perl DateTime project."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-1.55.tar.gz"

SRC_URI[md5sum] = "375be4e289d61fb8882e98f9ae9f6498"
SRC_URI[sha256sum] = "83eee03e377e0e6f8bdaa250353b5860a551b69cec46a327e489145b97f5abd0"
RDEPENDS:${PN} += "datetime-locale-perl"
RDEPENDS:${PN} += "datetime-timezone-perl"
RDEPENDS:${PN} += "dist-checkconflicts-perl"
RDEPENDS:${PN} += "namespace-autoclean-perl"
RDEPENDS:${PN} += "params-validationcompiler-perl"
RDEPENDS:${PN} += "specio-perl"
RDEPENDS:${PN} += "try-tiny-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
