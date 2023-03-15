DESCRIPTION = "This module provides bare bones "try"/"catch"/"finally" statements that are \
designed to minimize common mistakes with eval blocks, and NOTHING else."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Try-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Try-Tiny-0.31.tar.gz"

SRC_URI[md5sum] = "993a29ee8a03c9bd9c2f7c53d1082a03"
SRC_URI[sha256sum] = "3300d31d8a4075b26d8f46ce864a1d913e0e8467ceeba6655d5d2b2e206c11be"

S = "${WORKDIR}/Try-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
