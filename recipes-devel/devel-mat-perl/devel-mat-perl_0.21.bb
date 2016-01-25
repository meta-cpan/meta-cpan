DESCRIPTION = "A \"Devel::MAT\" instance loads a heapdump file, and provides a \
container to store analysis tools to work on it. Tools may be provided \
that conform to the Devel::MAT::Tool API, which can help analyse the data \
and interact with the explorer user interface by using the methods in the \
Devel::MAT::UI package."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-MAT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-0.21.tar.gz"

SRC_URI[md5sum] = "425d381a97a0b07fc3e305d5c7768680"
SRC_URI[sha256sum] = "7cb2f7c6baac7da3a1484cc951bccf5378b3bb0f8cf3b2fe0e035c13c458e075"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "list-utilsby-perl"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "scalar-list-utils-perl"
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
