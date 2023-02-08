DESCRIPTION = "This module provides a way to return immediately from a deeply nested call \
stack. This is similar to exceptions, but exceptions don't stop \
automatically at a target frame (and they can be caught by intermediate \
stack frames using "eval"). In other words, this is more like \
setjmp(3)/longjmp(3) than "die"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Return-MultiLevel"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Return-MultiLevel-0.08.tar.gz"

SRC_URI[md5sum] = "8633c5f19a261b68e4eaed622da6d770"
SRC_URI[sha256sum] = "51b1aef30c5c4009f640267a08589212e87dcd101800f0d20f9c635c9ffe88a1"
RRECOMMENDS:${PN} += "scope-upper-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Return-MultiLevel-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
