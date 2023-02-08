DESCRIPTION = "Searches upward from the calling module for a directory t with a lib \
directory inside it, and adds it to the module search path. Looks upward up \
to 5 directories. This is intended to be used in test modules either \
directly in t or in a subdirectory to find their included testing libraries \
located in t/lib."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Lib"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Test-Lib-0.002.tar.gz"

SRC_URI[md5sum] = "b24e39b9818ee11eca3d9d647e4aa395"
SRC_URI[sha256sum] = "14aead0483df0893600865c8c80c99709f8667381488fe45a516009a4eb35f11"

S = "${WORKDIR}/Test-Lib-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
