DESCRIPTION = "This module provides a protocol-independent way to use IPv4 and IPv6 \
sockets, intended as a replacement for IO::Socket::INET. Most constructor \
arguments and methods are provided in a backward-compatible way. For a list \
of known differences, see the \"IO::Socket::INET\" INCOMPATIBILITES \
section below."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-IP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Socket-IP-0.37.tar.gz"

SRC_URI[md5sum] = "49b39aa1be331dc983695d19ab47cef3"
SRC_URI[sha256sum] = "2adc5f0b641d41f662b4d99c0795780c62f9af9119884d053265fc8858ae6f7b"

S = "${WORKDIR}/IO-Socket-IP-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
