DESCRIPTION = "A "Future" object represents an operation that is currently in progress, or \
has recently completed. It can be used in a variety of ways to manage the \
flow of control, and data, through an asynchronous program."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Future"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Future-0.45.tar.gz"

SRC_URI[md5sum] = "1f20f5a33d4fc6cce4216c9384ab25e1"
SRC_URI[sha256sum] = "ce8cab6bb940434ffbf2465771bf6ed55df36ddca5bebc1024e7d4d07802a6c0"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Future-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
