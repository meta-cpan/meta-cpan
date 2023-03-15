DESCRIPTION = "A "Devel::MAT" instance loads a heapdump file, and provides a container to \
store analysis tools to work on it. Tools may be provided that conform to \
the Devel::MAT::Tool API, which can help analyse the data and interact with \
the explorer user interface by using the methods in the Devel::MAT::UI \
package."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-MAT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-0.44.tar.gz"

SRC_URI[md5sum] = "ecf3f79a2c6e95289494a85bbadb80ab"
SRC_URI[sha256sum] = "602d9282abc031e8990fad9d910dda2241d3017f62323ebd8a12a4b003ee7b20"
RDEPENDS:${PN} += "commandable-perl"
RDEPENDS:${PN} += "devel-mat-dumper-perl"
RDEPENDS:${PN} += "feature-compat-try-perl"
RDEPENDS:${PN} += "file-sharedir-perl"
RDEPENDS:${PN} += "heap-perl"
RDEPENDS:${PN} += "list-utilsby-perl"
RDEPENDS:${PN} += "module-pluggable-perl"
RDEPENDS:${PN} += "string-tagged-perl"
RDEPENDS:${PN} += "string-tagged-terminal-perl"
RDEPENDS:${PN} += "struct-dumb-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/Devel-MAT-${PV}"

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${LD} ${LDFLAGS}""

inherit cpan_build

do_configure() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_configure
}

do_compile() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
