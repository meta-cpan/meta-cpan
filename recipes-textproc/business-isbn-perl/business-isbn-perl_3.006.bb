DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-3.006.tar.gz"

SRC_URI[md5sum] = "9b9ecd69bc6157332836dc870217ac67"
SRC_URI[sha256sum] = "c1fefe68354ffb80cdbd24303ebe684b3b6828df3d5f09b429a09fc4f0919c9a"
RDEPENDS:${PN} += "business-isbn-data-perl"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
