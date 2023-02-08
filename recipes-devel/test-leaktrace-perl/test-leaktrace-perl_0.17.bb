DESCRIPTION = ""Test::LeakTrace" provides several functions that trace memory leaks. This \
module scans arenas, the memory allocation system, so it can detect any \
leaked SVs in given blocks."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-LeakTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEEJO/Test-LeakTrace-0.17.tar.gz"

SRC_URI[md5sum] = "afdb2cc6be0807cb635fb601a004d522"
SRC_URI[sha256sum] = "777d64d2938f5ea586300eef97ef03eacb43d4c1853c9c3b1091eb3311467970"

S = "${WORKDIR}/Test-LeakTrace-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
