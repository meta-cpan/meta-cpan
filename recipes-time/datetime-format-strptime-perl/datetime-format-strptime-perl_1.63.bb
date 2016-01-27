DESCRIPTION = "This module implements most of strptime(3), the POSIX function that is the \
reverse of strftime(3), for "DateTime". While "strftime" takes a "DateTime" \
and a pattern and returns a string, "strptime" takes a string and a pattern \
and returns the "DateTime" object associated."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Format-Strptime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Format-Strptime-1.63.tar.gz"

SRC_URI[md5sum] = "daa40cdf6650034c853a1783ff41c346"
SRC_URI[sha256sum] = "0e14e902dbb0122973efb7badd941050e790f14e82035bc13d607cbbaaf997e0"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "package-deprecationmanager-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Format-Strptime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
