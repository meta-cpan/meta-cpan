DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for a \
given class (or object), including where in the inheritance hierarchy the \
overloads are declared and where the code implementing them is."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-OverloadInfo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/Devel-OverloadInfo-0.007.tar.gz"

SRC_URI[md5sum] = "3dfb74ac00c25bcd8581e402fa414e19"
SRC_URI[sha256sum] = "21a184163b90f91f06ffc7f5de0b968356546ae9b400a9d75c573c958c246222"
RDEPENDS:${PN} += "mro-compat-perl"
RDEPENDS:${PN} += "package-stash-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Devel-OverloadInfo-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
