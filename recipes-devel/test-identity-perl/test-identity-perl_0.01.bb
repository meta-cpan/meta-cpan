DESCRIPTION = "This module provides a single testing function, "identical". It asserts \
that a given reference is as expected; that is, it either refers to the \
same object or is "undef". It is similar to "Test::More::is" except that it \
uses "refaddr", ensuring that it behaves correctly even if the references \
under test are objects that overload stringification or numification."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Identity"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Test-Identity-0.01.tar.gz"

SRC_URI[md5sum] = "ecef85c791cf5847e4c374983cf22a74"
SRC_URI[sha256sum] = "2f0205009aed152668182aafa16357ab1f47b4cbc001e89871b67387ef8e5f23"

S = "${WORKDIR}/Test-Identity-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
