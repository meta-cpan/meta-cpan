DESCRIPTION = "This module provides a Perl interface that allows writing compressed data \
to files or buffer as defined in RFC 1952."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Compress"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PM/PMQS/IO-Compress-2.074.tar.gz"

SRC_URI[md5sum] = "117232322523b5113f6bfc073d41eb69"
SRC_URI[sha256sum] = "b4bd68ce895a6578e5be96ade36449461becc328cc7ab900ae4e362380f097f2"

S = "${WORKDIR}/IO-Compress-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
