DESCRIPTION = "This module is written in preparation for when perl will gain true native \
syntax support for "try/catch" control flow."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Feature-Compat-Try"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Feature-Compat-Try-0.04.tar.gz"

SRC_URI[md5sum] = "93153de0ea6ade770362b625a5e044a8"
SRC_URI[sha256sum] = "4464d2314d79d08af1b3f1828a47dc036d512d6fbba52aa9fe11494d764dda8b"
RDEPENDS:${PN} += "syntax-keyword-try-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Feature-Compat-Try-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
