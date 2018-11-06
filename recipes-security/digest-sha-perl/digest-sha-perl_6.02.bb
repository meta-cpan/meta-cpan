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

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA-6.02.tar.gz"

SRC_URI[md5sum] = "e22f92fa4e2d7ec9b1168538b307d31c"
SRC_URI[sha256sum] = "2c66a6bea3eac9c210315ac7bf0af3e2e35679c4b65d8bae1ad4be3a58039b06"

S = "${WORKDIR}/Digest-SHA-${PV}"

inherit cpan

inherit update-alternatives

ALTERNATIVE_PRIORITY = "100"

ALTERNATIVE_${PN} = "shasum"
ALTERNATIVE_LINK_NAME[shasum] = "${bindir}/shasum"

BBCLASSEXTEND = "native"
