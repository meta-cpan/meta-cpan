DESCRIPTION = "This module implements an object class, instances of which store a \
(mutable) string buffer that supports tags. A tag is a name/value pair that \
applies to some non-empty extent of the underlying string."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Tagged"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-0.17.tar.gz"

SRC_URI[md5sum] = "a51cc8365d3cbf29c1c99a35ed9aabf2"
SRC_URI[sha256sum] = "2e4f254b8c336e297f007493bfa916688aa9bbf5d4fe534fe0a164dc206ef880"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/String-Tagged-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
