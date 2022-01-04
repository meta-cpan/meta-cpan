DESCRIPTION = "A "Future" object represents an operation that is currently in progress, or \
has recently completed. It can be used in a variety of ways to manage the \
flow of control, and data, through an asynchronous program."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Future"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Future-0.47.tar.gz"

SRC_URI[md5sum] = "6e3a568385fbbbb6b6ed65d96dd17a66"
SRC_URI[sha256sum] = "10a166157daff3370690571d2c6ceb9afd2c7b8518bbbce460c8a95d339cb0de"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/Future-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
