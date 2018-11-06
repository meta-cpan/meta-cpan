DESCRIPTION = "Digest::SHA3 is written in C for speed. If your platform lacks a C \
compiler, perhaps you can find the module in a binary form compatible with \
your particular processor and operating system."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-SHA3"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA3-1.04.tar.gz"

SRC_URI[md5sum] = "0fc1057f86916e6b5f96199ac5c7d4f4"
SRC_URI[sha256sum] = "4a68b67c5034f40fbb1344b304cd66caaa5e320eb523005201cc24f76d470c14"

S = "${WORKDIR}/Digest-SHA3-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
