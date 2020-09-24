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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/String-Tagged-0.16.tar.gz"

SRC_URI[md5sum] = "ca7fe148362c3e26cfda0e6fec2589cb"
SRC_URI[sha256sum] = "f07c2842aa759a8275b74d7ff625ff49a38fb7942da28d6ab71b70969f7373de"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/String-Tagged-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
