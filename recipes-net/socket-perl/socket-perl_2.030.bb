DESCRIPTION = "This module provides a variety of constants, structure manipulators and \
other functions related to socket-based networking. The values and \
functions provided are useful when used in conjunction with Perl core \
functions such as socket(), setsockopt() and bind(). It also provides \
several other support functions, mostly for dealing with conversions of \
network addresses between human-readable and native binary forms, and for \
hostname resolver operations."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Socket"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Socket-2.030.tar.gz"

SRC_URI[md5sum] = "991eff5f62f94273e5dcd8a0dc3173bb"
SRC_URI[sha256sum] = "2573571d0db6ab98b5472a371c4acb24fe53d890f920e43aab49a0eeabe6da67"

S = "${WORKDIR}/Socket-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
