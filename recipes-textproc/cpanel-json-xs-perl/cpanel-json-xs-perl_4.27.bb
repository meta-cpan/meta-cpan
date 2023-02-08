DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be *correct* and its secondary goal is to be *fast*. To \
reach the latter goal it was written in C."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cpanel-JSON-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/Cpanel-JSON-XS-4.27.tar.gz"

SRC_URI[md5sum] = "92d1d9bf10ae344ea8e2224fc2711c28"
SRC_URI[sha256sum] = "3aca5b346479726c56f197b5c98ff6036eb64590329d0480eb30120eea91044e"

S = "${WORKDIR}/Cpanel-JSON-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
