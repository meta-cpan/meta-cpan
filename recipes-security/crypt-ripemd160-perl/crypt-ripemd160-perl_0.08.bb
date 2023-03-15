DESCRIPTION = "The Crypt::RIPEMD160 module allows you to use the RIPEMD160 Message Digest \
algorithm from within Perl programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-RIPEMD160"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TODDR/Crypt-RIPEMD160-0.08.tar.gz"

SRC_URI[md5sum] = "0050e60658e2c0aa9710b5b0dd255ecb"
SRC_URI[sha256sum] = "34d1c87607f6c9defab3741b76d31bccfbb6d4d201af80e0f6083c378130b232"

S = "${WORKDIR}/Crypt-RIPEMD160-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
