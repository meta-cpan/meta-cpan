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

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA3-1.03.tar.gz"

SRC_URI[md5sum] = "8fbec553d919ce6f12bc0eae5ccdbab9"
SRC_URI[sha256sum] = "62865b6e82b0f2cd93c7a7451f59de41466fe030d4ed01e3f58be0d2a8cd1247"

S = "${WORKDIR}/Digest-SHA3-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
