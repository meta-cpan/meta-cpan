DESCRIPTION = "This module provides a variety of constants, structure manipulators and \
other functions related to socket-based networking. The values and \
functions provided are useful when used in conjunction with Perl core \
functions such as socket(), setsockopt() and bind(). It also provides \
several other support functions, mostly for dealing with conversions of \
network addresses between human-readable and native binary forms, and for \
hostname resolver operations."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Socket"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Socket-2.032.tar.gz"

SRC_URI[md5sum] = "bf3d0e13ff6775e0058b8f5ddaad626a"
SRC_URI[sha256sum] = "20ecb6ad469f4a13c5c7a891abfa12a3cecfdeccc7140ad57b05be12815dd517"

S = "${WORKDIR}/Socket-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
