DESCRIPTION = "This Log::Any adapter uses Log::Dispatch for logging."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any-Adapter-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PR/PREACTION/Log-Any-Adapter-Dispatch-0.08.tar.gz"

SRC_URI[md5sum] = "7b6ae20138e1403e1c2f9af8c031226c"
SRC_URI[sha256sum] = "aec93b57e5ea0adb9c3eee0858d216fb9263c86a4eced47e4565ed79233db4d9"
RDEPENDS_${PN} += "log-any-perl"
RDEPENDS_${PN} += "log-dispatch-perl"

S = "${WORKDIR}/Log-Any-Adapter-Dispatch-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
