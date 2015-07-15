DESCRIPTION = "DateTime is a class for the representation of date/time combinations, \
and is part of the Perl DateTime project. For details on this project \
please see <http://datetime.perl.org/>. The DateTime site has a FAQ which \
may help answer many \"how do I do X?\" questions. The FAQ is at \
<http://datetime.perl.org/wiki/datetime/page/FAQ>."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-1.20.tar.gz"

SRC_URI[md5sum] = "9cc3afee0f5cf6fb786aa7e2e32a89bd"
SRC_URI[sha256sum] = "ac909ca4e26f2713940302ad1fd8068de0a6970416a5a88a812cceb155becb0d"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
