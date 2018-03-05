DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% of \
the testing you will need to do for scripts in the script (or bin as is \
also commonly used) paths of your Perl distribution."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Script"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Test-Script-1.23.tar.gz"

SRC_URI[md5sum] = "1f36aed3debb06034f33b066262ace30"
SRC_URI[sha256sum] = "33a1e71b9797228c2124eea76831492ca9372e8f8075f3d8cded3ef818af44b1"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "probe-perl-perl"
RDEPENDS_${PN} += "test-simple-perl"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Test-Script-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
