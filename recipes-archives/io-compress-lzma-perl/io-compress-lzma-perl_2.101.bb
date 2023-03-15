DESCRIPTION = "This module provides a Perl interface that allows writing lzma compressed \
data to files or buffer."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Compress-Lzma"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-Lzma-2.101.tar.gz"

SRC_URI[md5sum] = "74b73b3363875e656070acfba230ef1c"
SRC_URI[sha256sum] = "1ae686dbe45dbdcf0c7cccf8a0cd81a579a019601f8e35533db93dcdd8282a90"
RDEPENDS:${PN} += "compress-raw-lzma-perl"
RDEPENDS:${PN} += "io-compress-perl"

S = "${WORKDIR}/IO-Compress-Lzma-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
