DESCRIPTION = "Template::Tiny is a reimplementation of a subset of the functionality from \
Template Toolkit in as few lines of code as possible."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Template-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Template-Tiny-1.14.tar.gz"

SRC_URI[md5sum] = "536563598c2bb3c3b763a9ecb8eaef01"
SRC_URI[sha256sum] = "819cfab6044483cfe28ceb287fddfc3176a2025b1b6f0e980b2dcc26d2269b4c"

S = "${WORKDIR}/Template-Tiny-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
