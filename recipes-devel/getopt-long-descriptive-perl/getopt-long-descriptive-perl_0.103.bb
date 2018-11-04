DESCRIPTION = "Getopt::Long::Descriptive is yet another Getopt library. It's built atop \
Getopt::Long, and gets a lot of its features, but tries to avoid making you \
think about its huge array of options."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Getopt-Long-Descriptive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Getopt-Long-Descriptive-0.103.tar.gz"

SRC_URI[md5sum] = "96c1a1f9cfabd50a20da208e8d13a47b"
SRC_URI[sha256sum] = "70e1bae7404a9dfb638b5d12e5bd4ea97e3bee743a4555909307d68e0111f4b2"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Getopt-Long-Descriptive-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
