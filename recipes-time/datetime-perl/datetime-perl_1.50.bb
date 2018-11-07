DESCRIPTION = "DateTime is a class for the representation of date/time combinations, and \
is part of the Perl DateTime project. For details on this project please \
see <http://datetime.perl.org/>. The DateTime site has a FAQ which may help \
answer many "how do I do X?" questions. The FAQ is at \
<http://datetime.perl.org/wiki/datetime/page/FAQ>."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-1.50.tar.gz"

SRC_URI[md5sum] = "75f9d317dadade464379d136e5abeae6"
SRC_URI[sha256sum] = "ed6b0c71ddd81310a82459508df9197074e6b13aea46fd279045c3ddc3c4b198"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "specio-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
