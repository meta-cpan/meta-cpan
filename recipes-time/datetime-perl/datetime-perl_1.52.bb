DESCRIPTION = 'DateTime is a class for the representation of date/time combinations, and \
is part of the Perl DateTime project. For details on this project please \
see <http://datetime.perl.org/>. The DateTime site has a FAQ which may help \
answer many "how do I do X?" questions. The FAQ is at \
<http://datetime.perl.org/wiki/datetime/page/FAQ>.'

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-1.52.tar.gz"

SRC_URI[md5sum] = "f18d180e2d7e5110f75e7a20955588f3"
SRC_URI[sha256sum] = "67828b6172b23d9534b8f2a593b05caa6240737a3b2246f3e1fe4e015dbc3dfc"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "specio-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN}-dev += "dist-checkconflicts-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

FILES_${PN}-dev += "${PERLLIBDIRS}/vendor_perl/${PERLVERSION}/DateTime/Conflicts.pm"
