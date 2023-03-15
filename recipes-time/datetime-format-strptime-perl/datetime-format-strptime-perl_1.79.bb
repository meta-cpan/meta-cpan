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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Format-Strptime-1.79.tar.gz"

SRC_URI[md5sum] = "441cfec62b0b8a1b4c05cbe5ef73fbf4"
SRC_URI[sha256sum] = "701e46802c86ed4d88695c1a6dacbbe90b3390beeb794f387e7c792300037579"
RDEPENDS:${PN} += "datetime-locale-perl"
RDEPENDS:${PN} += "datetime-perl"
RDEPENDS:${PN} += "datetime-timezone-perl"
RDEPENDS:${PN} += "params-validationcompiler-perl"
RDEPENDS:${PN} += "specio-perl"
RDEPENDS:${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Format-Strptime-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
