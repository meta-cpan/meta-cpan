DESCRIPTION = "Easily test network connectivity"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-RequiresInternet"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MALLEN/Test-RequiresInternet-0.05.tar.gz"

SRC_URI[md5sum] = "0ba9f1cff4cf90ed2618c2eddfd525d8"
SRC_URI[sha256sum] = "bba7b32a1cc0d58ce2ec20b200a7347c69631641e8cae8ff4567ad24ef1e833e"

S = "${WORKDIR}/Test-RequiresInternet-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
