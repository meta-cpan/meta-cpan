DESCRIPTION = "This module implements the "URI" class. Objects of this class represent \
"Uniform Resource Identifier references" as specified in RFC 2396 (and \
updated by RFC 2732)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/URI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.73.tar.gz"

SRC_URI[md5sum] = "37d44a08e599aa945b32a9434ffe00a5"
SRC_URI[sha256sum] = "cca7ab4a6f63f3ccaacae0f2e1337e8edf84137e73f18548ec7d659f23efe413"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
