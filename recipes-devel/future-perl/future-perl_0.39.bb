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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Future-0.39.tar.gz"

SRC_URI[md5sum] = "320f24ffb8ee50906af8d50c6ed12c92"
SRC_URI[sha256sum] = "1fdd988fabf477ad57156c8f9c1948c8037d7851830e8f37ae74e5a0ee4b6b45"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Future-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
