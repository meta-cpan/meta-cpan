DESCRIPTION = "By default, this module exports a single hash (%RE) that stores or \
generates commonly needed regular expressions (see "List of available \
patterns")."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Regexp-Common"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABIGAIL/Regexp-Common-2016010801.tar.gz"

SRC_URI[md5sum] = "a7a86d2d4ec05b77898823f7b36ff59e"
SRC_URI[sha256sum] = "65558ad12b5f6250c483b5980e8533048c46912d6d69c76150f8f95a5b8eb1c4"

S = "${WORKDIR}/Regexp-Common-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
