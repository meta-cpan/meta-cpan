DESCRIPTION = "This modules provides a collection of test utilities for file attributes."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-File"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Test-File-1.448.tar.gz"

SRC_URI[md5sum] = "b4701559a827f348f36b487867d2c528"
SRC_URI[sha256sum] = "084152680a2cecc10f1a06b8a2a41f166d8d9311eb12022b53d36ccb50716a34"
DEPENDS += "test-utf8-perl-native"

S = "${WORKDIR}/Test-File-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
