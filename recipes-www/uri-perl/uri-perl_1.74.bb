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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/URI-1.74.tar.gz"

SRC_URI[md5sum] = "892f7183b178af40f205ba37128225db"
SRC_URI[sha256sum] = "a9c254f45f89cb1dd946b689dfe433095404532a4543bdaab0b71ce0fdcdd53d"
DEPENDS += "test-needs-perl-native"

S = "${WORKDIR}/URI-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
