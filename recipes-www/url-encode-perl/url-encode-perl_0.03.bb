DESCRIPTION = "This module provides functions to encode and decode strings into and from \
the "application/x-www-form-urlencoded" encoding."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URL-Encode"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = " https://cpan.metacpan.org/authors/id/C/CH/CHANSEN/URL-Encode-0.03.tar.gz \
            file://Makefile_PL_add-dot-to-INC.patch \
"

SRC_URI[md5sum] = "3501ba92bbd23bb230959a5c9a22ca12"
SRC_URI[sha256sum] = "7295d7f07796b179131d9c0f230a6effa56d204de2f8dc72f2e09c61458c8ee6"
RRECOMMENDS_${PN} += "url-encode-xs-perl"

S = "${WORKDIR}/URL-Encode-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
