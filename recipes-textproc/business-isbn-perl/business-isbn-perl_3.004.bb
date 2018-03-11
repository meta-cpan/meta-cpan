DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-3.004.tar.gz"

SRC_URI[md5sum] = "60b36c0a92cf51e9027ec3d9f38e7224"
SRC_URI[sha256sum] = "31754acd57bf0c3d4762003d784bce4a0af6832a725336e219fb2988b6fb831e"
RDEPENDS_${PN} += "business-isbn-data-perl"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
