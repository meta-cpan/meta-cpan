DESCRIPTION = "This module provides bare bones "try"/"catch"/"finally" \
statements that are designed to minimize common mistakes with eval \
blocks, and NOTHING else."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Try-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Try-Tiny-0.24.tar.gz"

SRC_URI[md5sum] = "1a12a51cfeb7e2c301e4ae093c7ecdfb"
SRC_URI[sha256sum] = "9b7a1af24c0256973d175369ebbdc25ec01e2452a97f2d3ab61481c826f38d81"
RECOMMENDS += "capture-tiny-perl-native"

S = "${WORKDIR}/Try-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
