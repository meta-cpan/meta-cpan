DESCRIPTION = "The Heap collection of modules provide routines that manage a heap of \
elements. A heap is a partially sorted structure that is always able to \
easily extract the smallest of the elements in the structure (or the \
largest if a reversed compare routine is provided)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Heap"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/J/JM/JMM/Heap-0.80.tar.gz"

SRC_URI[md5sum] = "05fed19a7552dadee11c780cd68c0116"
SRC_URI[sha256sum] = "ccda29f3c93176ad0fdfff4dd6f5e4ac90b370cba4b028386b7343bf64139bde"

S = "${WORKDIR}/Heap-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
