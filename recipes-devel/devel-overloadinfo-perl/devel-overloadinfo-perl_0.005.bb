DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for a \
given class (or object), including where in the inheritance hierarchy the \
overloads are declared and where the code implementing them is."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-OverloadInfo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/Devel-OverloadInfo-0.005.tar.gz"

SRC_URI[md5sum] = "607b65dfe9fdb47df780f3b22dcb7917"
SRC_URI[sha256sum] = "8bfde2ffa47c9946f8adc8cfc445c2f97b8d1cdd678111bee9f444e82f7aa6e7"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "sub-identify-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Devel-OverloadInfo-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
