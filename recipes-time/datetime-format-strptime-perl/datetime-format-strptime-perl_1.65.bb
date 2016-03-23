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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Format-Strptime-1.65.tar.gz"

SRC_URI[md5sum] = "3e20314555438dfde8308c55ad203556"
SRC_URI[sha256sum] = "621ae39efd1134850b5d47b6cba772a250d7920c268e05cfb9908d993d3cd527"
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
