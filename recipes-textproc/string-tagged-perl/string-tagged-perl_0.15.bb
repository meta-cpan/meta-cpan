DESCRIPTION = "This module implements an object class, instances of which store a \
(mutable) string buffer that supports tags. A tag is a name/value pair that \
applies to some non-empty extent of the underlying string."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Tagged"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-0.15.tar.gz"

SRC_URI[md5sum] = "3557a98e3ae548e9cc773acd64ac2438"
SRC_URI[sha256sum] = "0f4bb11a80ec54403d3e32a0db3091570c2c7218b5b2a411480e6bb9bd89d3a0"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/String-Tagged-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
