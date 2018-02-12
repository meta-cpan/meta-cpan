DESCRIPTION = "This module provides bare bones "try"/"catch"/"finally" statements that are \
designed to minimize common mistakes with eval blocks, and NOTHING else."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Try-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Try-Tiny-0.30.tar.gz"

SRC_URI[md5sum] = "eb362c3cb32c42f9f28de9ddb7f2ead6"
SRC_URI[sha256sum] = "da5bd0d5c903519bbf10bb9ba0cb7bcac0563882bcfe4503aee3fb143eddef6b"

S = "${WORKDIR}/Try-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
