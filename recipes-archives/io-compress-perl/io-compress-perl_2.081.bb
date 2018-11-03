DESCRIPTION = "This module is not intended for direct use in application code. Its sole \
purpose is to be sub-classed by IO::Compress modules."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Compress"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-2.081.tar.gz"

SRC_URI[md5sum] = "379932c1b9428b873ed7ad3c1db15872"
SRC_URI[sha256sum] = "5211c775544dc8c511af08edfb1c0c22734daa2789149c2a88d68e17b43546d9"
RDEPENDS_${PN} += "compress-raw-bzip2-perl"
RDEPENDS_${PN} += "compress-raw-zlib-perl"

S = "${WORKDIR}/IO-Compress-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
