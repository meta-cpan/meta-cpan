DESCRIPTION = "A "Devel::MAT" instance loads a heapdump file, and provides a container to \
store analysis tools to work on it. Tools may be provided that conform to \
the Devel::MAT::Tool API, which can help analyse the data and interact with \
the explorer user interface by using the methods in the Devel::MAT::UI \
package."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-MAT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-0.43.tar.gz"

SRC_URI[md5sum] = "05c32c5797e5e07d43e784de84a7c726"
SRC_URI[sha256sum] = "ffe9f590581782afc1ed529736b059150b6b72bf1dde472c06eda38e24ac7310"
RDEPENDS_${PN} += "commandable-perl"
RDEPENDS_${PN} += "devel-mat-dumper-perl"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "heap-perl"
RDEPENDS_${PN} += "list-utilsby-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "string-tagged-perl"
RDEPENDS_${PN} += "string-tagged-terminal-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
RDEPENDS_${PN} += "syntax-keyword-try-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/Devel-MAT-${PV}"

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${LD} ${LDFLAGS}""

inherit cpan_build

do_compile() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
