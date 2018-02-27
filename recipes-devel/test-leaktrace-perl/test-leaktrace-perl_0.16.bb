DESCRIPTION = ""Test::LeakTrace" provides several functions that trace memory leaks. This \
module scans arenas, the memory allocation system, so it can detect any \
leaked SVs in given blocks."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-LeakTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEEJO/Test-LeakTrace-0.16.tar.gz"

SRC_URI[md5sum] = "d58f3e0fed32df8255787a77d7d87641"
SRC_URI[sha256sum] = "5f089eed915f1ec8c743f6d2777c3ecd0ca01df2f7b9e10038d316952583e403"

S = "${WORKDIR}/Test-LeakTrace-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
