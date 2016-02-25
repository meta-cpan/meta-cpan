DESCRIPTION = "By default, this module exports a single hash (%RE) that stores or \
generates commonly needed regular expressions (see "List of available \
patterns")."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Regexp-Common"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABIGAIL/Regexp-Common-2016020301.tar.gz"

SRC_URI[md5sum] = "a3126d635295869bf78c4e5c8f5e9949"
SRC_URI[sha256sum] = "ccdcb6ca034b2948f2efa042c75aff9edee355b800a81943432efcca95fa7e59"

S = "${WORKDIR}/Regexp-Common-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
