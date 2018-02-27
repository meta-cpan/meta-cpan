DESCRIPTION = "This module allows you to deliberately hide modules from a program even \
though they are installed. This is mostly useful for testing modules that \
have a fallback when a certain dependency module is not installed."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Without-Module"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CO/CORION/Test-Without-Module-0.20.tar.gz"

SRC_URI[md5sum] = "34684186b66929bbcd12d3ac8ae03f9d"
SRC_URI[sha256sum] = "8e9aeb7c32a6c6d0b8a93114db2a8c072721273a9d9a2dd4f9ca86cfd28aa524"

S = "${WORKDIR}/Test-Without-Module-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
