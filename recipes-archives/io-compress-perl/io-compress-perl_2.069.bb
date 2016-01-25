DESCRIPTION = "This module provides a Perl interface that allows writing compressed \
data to files or buffer as defined in RFC 1952."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Compress"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-2.069.tar.gz"

SRC_URI[md5sum] = "b26925161e3f01919f60344d1bbb49c4"
SRC_URI[sha256sum] = "e9d36d93e12874536ecbf6c1db80aae34236645798b3501b479c78e09da3f28c"
RDEPENDS_${PN} += "compress-raw-bzip2-perl"
RDEPENDS_${PN} += "compress-raw-zlib-perl"

S = "${WORKDIR}/IO-Compress-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
