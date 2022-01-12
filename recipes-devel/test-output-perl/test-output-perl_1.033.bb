DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
"STDOUT" or "STDERR". A number of different utilities are included to try \
and be as flexible as possible to the tester."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Output"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Test-Output-1.033.tar.gz"

SRC_URI[md5sum] = "454bac1d7423e793c820b7d70987fbc6"
SRC_URI[sha256sum] = "f6a8482740b075fad22aaf4d987d38ef927c6d2b452d4ae0d0bd8f779830556e"
RDEPENDS:${PN} += "capture-tiny-perl"

S = "${WORKDIR}/Test-Output-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
