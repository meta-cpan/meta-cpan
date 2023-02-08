DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object are \
present."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CPAN-Meta-Check"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/CPAN-Meta-Check-0.014.tar.gz"

SRC_URI[md5sum] = "ccd4448a7b08e1e3ef6f475030b282c9"
SRC_URI[sha256sum] = "28a0572bfc1c0678d9ce7da48cf521097ada230f96eb3d063fcbae1cfe6a351f"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/CPAN-Meta-Check-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
