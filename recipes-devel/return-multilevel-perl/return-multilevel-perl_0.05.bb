DESCRIPTION = "This module provides a way to return immediately from a deeply nested call \
stack. This is similar to exceptions, but exceptions don't stop \
automatically at a target frame (and they can be caught by intermediate \
stack frames using "eval"). In other words, this is more like \
setjmp(3)/longjmp(3) than "die"."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Return-MultiLevel"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAUKE/Return-MultiLevel-0.05.tar.gz"

SRC_URI[md5sum] = "0364afe664e8997ffb2163d565b2d915"
SRC_URI[sha256sum] = "ff076fbaba653c09953ac53959fe6c64fb52a33db3b5d223a015ab75ac3ed91d"
RDEPENDS_${PN} += "data-munge-perl"
RRECOMMENDS_${PN} += "scope-upper-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Return-MultiLevel-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
