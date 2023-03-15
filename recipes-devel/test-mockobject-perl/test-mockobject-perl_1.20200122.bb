DESCRIPTION = "It's a simple program that doesn't use any other modules, and those are \
easy to test. More often, testing a program completely means faking up \
input to another module, trying to coax the right output from something \
you're not supposed to be testing anyway."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-MockObject"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHROMATIC/Test-MockObject-1.20200122.tar.gz"

SRC_URI[md5sum] = "67a1869d91d2e5d60d8986c13333978a"
SRC_URI[sha256sum] = "2b7f80da87f5a6fe0360d9ee521051053017442c3a26e85db68dfac9f8307623"
RDEPENDS:${PN} += "universal-can-perl"
RDEPENDS:${PN} += "universal-isa-perl"
DEPENDS += "test-exception-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Test-MockObject-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
