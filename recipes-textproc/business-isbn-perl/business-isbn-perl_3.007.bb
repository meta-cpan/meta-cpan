DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-3.007.tar.gz"

SRC_URI[md5sum] = "6270020dc5a2e3ae7264ef4e4d4fb344"
SRC_URI[sha256sum] = "50cc4686dd21c9537b49a231d71711e814ebd2f19aa4ca331baf92ff2de5ce19"
RDEPENDS:${PN} += "business-isbn-data-perl"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
