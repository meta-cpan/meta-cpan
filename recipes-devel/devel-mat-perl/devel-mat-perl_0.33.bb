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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-0.33.tar.gz"

SRC_URI[md5sum] = "4772d3578a825afabbd6c052155ca432"
SRC_URI[sha256sum] = "5b2b8c3d1b5ed57c4e47d75587b056ed4bf1525417a6d8631bd947f8647ce8fe"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "list-utilsby-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "scalar-list-utils-perl"
RDEPENDS_${PN} += "string-tagged-perl"
RDEPENDS_${PN} += "string-tagged-terminal-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/Devel-MAT-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
