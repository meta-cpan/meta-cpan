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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Test-Script-1.26.tar.gz"

SRC_URI[md5sum] = "12f683b13d49e5bf0de7259fc7180e49"
SRC_URI[sha256sum] = "6d42237aece2f0dc41fa6653379574674061848f020acd4d63deb6b81b5a73b7"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "probe-perl-perl"
RDEPENDS_${PN} += "test-simple-perl"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Test-Script-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
