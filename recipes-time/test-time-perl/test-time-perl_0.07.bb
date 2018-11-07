DESCRIPTION = "Test::Time can be used to test modules that deal with time. Once you "use" \
this module, all references to "time", "localtime" and "sleep" will be \
internalized. You can set custom time by passing time => number after the \
"use" statement:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Time"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SATOH/Test-Time-0.07.tar.gz"

SRC_URI[md5sum] = "56300911673e1f5d2df2d335512c9d02"
SRC_URI[sha256sum] = "515d5e6b1d2e632dda0cc430485ef2ecc8cd6090cb32fcf17dbd7a983688b064"

S = "${WORKDIR}/Test-Time-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
