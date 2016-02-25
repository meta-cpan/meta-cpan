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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Format-Strptime-1.64.tar.gz"

SRC_URI[md5sum] = "4599cb0b80e4b3bb2d22848b0e540321"
SRC_URI[sha256sum] = "b7168c3740d39f07d2c7e36797c296184fd1cf20d4d9305c021bd7ee719a5400"
RDEPENDS_${PN} += "datetime-locale-perl"
RDEPENDS_${PN} += "datetime-perl"
RDEPENDS_${PN} += "datetime-timezone-perl"
RDEPENDS_${PN} += "package-deprecationmanager-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Format-Strptime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
