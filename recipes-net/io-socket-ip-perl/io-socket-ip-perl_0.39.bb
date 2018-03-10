DESCRIPTION = "This module provides a protocol-independent way to use IPv4 and IPv6 \
sockets, intended as a replacement for IO::Socket::INET. Most constructor \
arguments and methods are provided in a backward-compatible way. For a list \
of known differences, see the "IO::Socket::INET" INCOMPATIBILITES section \
below."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-IP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Socket-IP-0.39.tar.gz"

SRC_URI[md5sum] = "fe49e4f6638c55124b4f1fb9ee8fe134"
SRC_URI[sha256sum] = "11950da7636cb786efd3bfb5891da4c820975276bce43175214391e5c32b7b96"

S = "${WORKDIR}/IO-Socket-IP-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
