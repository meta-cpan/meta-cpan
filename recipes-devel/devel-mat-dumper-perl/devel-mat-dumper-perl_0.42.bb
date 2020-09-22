DESCRIPTION = "This module provides the memory-dumping function that creates a heap dump \
file which can later be read by Devel::MAT::Dumpfile. It provides a single \
function which is not exported, which writes a file to the given path."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-MAT-Dumper"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-Dumper-0.42.tar.gz"

SRC_URI[md5sum] = "d83519971479872bd585ff7a9d523079"
SRC_URI[sha256sum] = "bc74191dc39d2331948ce98fe750c5b0064aa71197c1e265c6674e750e64a3bd"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Devel-MAT-Dumper-${PV}"

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${CCLD} ${LDFLAGS}""

inherit cpan_build

do_compile() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
