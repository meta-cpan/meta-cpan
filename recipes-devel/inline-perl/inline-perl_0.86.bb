DESCRIPTION = "The Inline module allows you to put source code from other programming \
languages directly "inline" in a Perl script or module. The code is \
automatically compiled as needed, and then loaded for immediate access from \
Perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Inline"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/Inline-0.86.tar.gz"

SRC_URI[md5sum] = "41cee7671b4bfb06a189221f32697e1c"
SRC_URI[sha256sum] = "510a7de2d011b0db80b0874e8c0f7390010991000ae135cff7474df1e6d51e3a"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Inline-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
