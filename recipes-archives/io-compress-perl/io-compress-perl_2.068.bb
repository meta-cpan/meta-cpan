DESCRIPTION = "This module provides a Perl interface that allows writing compressed \
data to files or buffer as defined in RFC 1952."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Compress"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-2.068.tar.gz"

SRC_URI[md5sum] = "959f9b3a42d72da790c46eb0377c0fbc"
SRC_URI[sha256sum] = "fa058d9c0c7fce95ca1387a95d7ad646c097fe68f26ae9fe742dc973e555c037"
RDEPENDS_${PN} += "compress-raw-bzip2-perl"
RDEPENDS_${PN} += "compress-raw-zlib-perl"

S = "${WORKDIR}/IO-Compress-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
