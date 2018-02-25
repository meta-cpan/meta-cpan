DESCRIPTION = "By default, this module exports a single hash (%RE) that stores or \
generates commonly needed regular expressions (see "List of available \
patterns")."

SECTION = "libs"
LICENSE = "MIT | MIT | BSD-3-Clause | Artisticv1 | Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Regexp-Common"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9 \
file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABIGAIL/Regexp-Common-2017060201.tar.gz"

SRC_URI[md5sum] = "b1bb40759b84154990f36a160160fb94"
SRC_URI[sha256sum] = "ee07853aee06f310e040b6bf1a0199a18d81896d3219b9b35c9630d0eb69089b"
RECOMMENDS += "test-regexp-perl-native"

S = "${WORKDIR}/Regexp-Common-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
