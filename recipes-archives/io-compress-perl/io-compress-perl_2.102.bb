DESCRIPTION = "This module is not intended for direct use in application code. Its sole \
purpose is to be sub-classed by IO::Compress modules."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Compress"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-2.102.tar.gz"

SRC_URI[md5sum] = "b79ef532ba8b6c1672dc2a401715f5cf"
SRC_URI[sha256sum] = "d6fa7f9a5beee446452a0fbc43589a0c73fe7e925c075b98628b018048dc72a4"
RDEPENDS:${PN} += "compress-raw-bzip2-perl"
RDEPENDS:${PN} += "compress-raw-zlib-perl"

S = "${WORKDIR}/IO-Compress-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
