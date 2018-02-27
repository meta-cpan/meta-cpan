DESCRIPTION = "It's a simple program that doesn't use any other modules, and those are \
easy to test. More often, testing a program completely means faking up \
input to another module, trying to coax the right output from something \
you're not supposed to be testing anyway."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-MockObject"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHROMATIC/Test-MockObject-1.20161202.tar.gz"

SRC_URI[md5sum] = "14de6c04bc3a4bf5b71a199ba0247a17"
SRC_URI[sha256sum] = "14b225fff3645338697976dbbe2c39e44c1c93536855b78b3bbc6e9bfe94a0a2"
DEPENDS += "test-exception-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Test-MockObject-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
