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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-1.26.tar.gz"

SRC_URI[md5sum] = "44999f88e58b6e40762e49b93b3de9a0"
SRC_URI[sha256sum] = "f889baf4f743edbccec57ec1cd9790a985f435b6b84f72b5f2ac39544e1bfe7b"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
