DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% of \
the testing you will need to do for scripts in the script (or bin as is \
also commonly used) paths of your Perl distribution."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Script"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Test-Script-1.29.tar.gz"

SRC_URI[md5sum] = "cadfb1d1fdc421e338521e373d7a9eb7"
SRC_URI[sha256sum] = "892e7e6c1ea7b16710909942cf5c0bdab70eee2efd4aa9c16ea952e2b90f8950"
RDEPENDS:${PN} += "capture-tiny-perl"
RDEPENDS:${PN} += "probe-perl-perl"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Test-Script-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
