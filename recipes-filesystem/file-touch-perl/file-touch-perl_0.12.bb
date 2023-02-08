DESCRIPTION = "This module provides both a functional and OO interface for changing the \
file access and modification times on files. It can optionally create the \
file for you, if it doesn't exist."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Touch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/File-Touch-0.12.tar.gz"

SRC_URI[md5sum] = "84215f5010adcbec0065e1c718d8875f"
SRC_URI[sha256sum] = "2a04dc424df48e98c54556c6045cab026a49e3737aa94a21cf497761b0f2e59c"

S = "${WORKDIR}/File-Touch-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
