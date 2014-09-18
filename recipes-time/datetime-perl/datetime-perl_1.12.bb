DESCRIPTION = "DateTime is a class for the representation of date/time combinations, \
and is part of the Perl DateTime project. For details on this project \
please see \
<http://datetime.perl.org/>. The DateTime site has a FAQ which may help \
answer many \"how do I do X?\" questions. The FAQ is at \
<http://datetime.perl.org/wiki/datetime/page/FAQ>."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-1.12.tar.gz"

SRC_URI[md5sum] = "a51fa8d7121cb4910a549b897c7753d7"
SRC_URI[sha256sum] = "e65a333806d000825724cfa23d7d33539b853b6e819d4922d2a68579416374ce"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
