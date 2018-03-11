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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Format-Strptime-1.75.tar.gz"

SRC_URI[md5sum] = "3f081b0068d82007392a22a33647f0a0"
SRC_URI[sha256sum] = "4fcfb2ac4f79d7ff2855a405f39050d2ea691ee098ce54ede8af79c8d6ab3c19"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "package-deprecationmanager-perl"
RDEPENDS_${PN} += "params-validationcompiler-perl"
RDEPENDS_${PN} += "specio-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Format-Strptime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
