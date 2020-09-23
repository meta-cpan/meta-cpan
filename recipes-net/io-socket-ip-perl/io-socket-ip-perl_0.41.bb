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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Socket-IP-0.41.tar.gz"

SRC_URI[md5sum] = "629947f8b86b08b7a636bd7ccc3d4925"
SRC_URI[sha256sum] = "849a45a238f8392588b97722c850382c4e6d157cd08a822ddcb9073c73bf1446"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/IO-Socket-IP-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
