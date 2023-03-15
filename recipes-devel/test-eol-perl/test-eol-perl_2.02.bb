DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of windows line endings."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-EOL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-EOL-2.02.tar.gz"

SRC_URI[md5sum] = "5d22a042cc7dc92711fd4af833893826"
SRC_URI[sha256sum] = "283199d7fb27807fe2226af7b12571c6dc2508d8e5c0feb505d089d31720afc4"

S = "${WORKDIR}/Test-EOL-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
