DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
"STDOUT" or "STDERR". A number of different utilities are included to try \
and be as flexible as possible to the tester."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Output"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Test-Output-1.031.tar.gz"

SRC_URI[md5sum] = "5384ea67483c98290c1e51b3b2aee84d"
SRC_URI[sha256sum] = "f8b8f37185717872727d06f6c078fa77db794410faf2f6da4d37b0b7650f7ea4"
RDEPENDS_${PN} += "capture-tiny-perl"

S = "${WORKDIR}/Test-Output-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
