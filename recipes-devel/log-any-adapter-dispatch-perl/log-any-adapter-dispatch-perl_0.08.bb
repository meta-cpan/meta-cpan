DESCRIPTION = "This Log::Any adapter uses Log::Dispatch for logging."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any-Adapter-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PR/PREACTION/Log-Any-Adapter-Dispatch-0.08.tar.gz"

SRC_URI[md5sum] = "7b6ae20138e1403e1c2f9af8c031226c"
SRC_URI[sha256sum] = "aec93b57e5ea0adb9c3eee0858d216fb9263c86a4eced47e4565ed79233db4d9"
RDEPENDS:${PN} += "log-any-perl"
RDEPENDS:${PN} += "log-dispatch-perl"

S = "${WORKDIR}/Log-Any-Adapter-Dispatch-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
