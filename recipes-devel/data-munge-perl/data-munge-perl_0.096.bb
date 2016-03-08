DESCRIPTION = "This module defines a few generally useful utility functions. I got tired \
of redefining or working around them, so I wrote this module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Munge"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAUKE/Data-Munge-0.096.tar.gz"

SRC_URI[md5sum] = "0e98f5c7ff81c54e66b8633e98d1ced6"
SRC_URI[sha256sum] = "1904f9c3602db07f5981c3f78eea06c8f1db475d5b8bc2a49d1083d46a13d0df"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Data-Munge-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
