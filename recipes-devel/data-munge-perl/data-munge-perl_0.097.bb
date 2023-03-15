DESCRIPTION = "This module defines a few generally useful utility functions. I got tired \
of redefining or working around them, so I wrote this module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Munge"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAUKE/Data-Munge-0.097.tar.gz"

SRC_URI[md5sum] = "4c6f56a3af0272ed4509aae646b8c540"
SRC_URI[sha256sum] = "d63469cab6ceb74247c844301c7d38ecd7d63dc6954a0aa359efbc48353bdd65"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Data-Munge-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
