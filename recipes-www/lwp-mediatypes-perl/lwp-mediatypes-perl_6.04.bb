DESCRIPTION = "This module provides functions for handling media (also known as MIME) \
types and encodings. The mapping from file extensions to media types is \
defined by the media.types file. If the ~/.media.types file exists it is \
used instead. For backwards compatibility we will also look for \
~/.mime.types."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-MediaTypes"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/LWP-MediaTypes-6.04.tar.gz"

SRC_URI[md5sum] = "84b799a90c0d2ce52897a7cb4c0478d0"
SRC_URI[sha256sum] = "8f1bca12dab16a1c2a7c03a49c5e58cce41a6fec9519f0aadfba8dad997919d9"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/LWP-MediaTypes-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
