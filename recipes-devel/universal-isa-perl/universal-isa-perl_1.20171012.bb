DESCRIPTION = "Whenever you use "isa" in UNIVERSAL as a function, a kitten using \
Test::MockObject dies. Normally, the kittens would be helpless, but if they \
use UNIVERSAL::isa (the module whose docs you are reading), the kittens can \
live long and prosper."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/UNIVERSAL-isa"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/UNIVERSAL-isa-1.20171012.tar.gz"

SRC_URI[md5sum] = "668a981d2716b231937236c122124282"
SRC_URI[sha256sum] = "d16956036cb01c819dec7d294f6ef891be0bb64876989601354b293164da7f2b"

S = "${WORKDIR}/UNIVERSAL-isa-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
