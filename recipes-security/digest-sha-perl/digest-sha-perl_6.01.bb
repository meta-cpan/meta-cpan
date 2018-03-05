DESCRIPTION = "Digest::SHA is written in C for speed. If your platform lacks a C compiler, \
you can install the functionally equivalent (but much slower) \
Digest::SHA::PurePerl module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-SHA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA-6.01.tar.gz"

SRC_URI[md5sum] = "fd5630ba3c09d92c6fdfc238f7e0064b"
SRC_URI[sha256sum] = "2d5292d3dd1c1a463ca6efefad016e256d28a1338f203d639b903617183302cb"

S = "${WORKDIR}/Digest-SHA-${PV}"

inherit cpan

inherit update-alternatives

ALTERNATIVE_PRIORITY = "100"

ALTERNATIVE_${PN} = "shasum"
ALTERNATIVE_LINK_NAME[shasum] = "${bindir}/shasum"

BBCLASSEXTEND = "native"
