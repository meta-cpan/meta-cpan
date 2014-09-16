DESCRIPTION = "A \"Devel::MAT\" instance loads a heapdump file, and provides a \
container to store analysis tools to work on it. Tools may be provided \
that conform to \
the Devel::MAT::Tool API, which can help analyse the data and interact \
with \
the explorer user interface by using the methods in the Devel::MAT::UI \
package."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-MAT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Devel-MAT-0.18.tar.gz"

SRC_URI[md5sum] = "15e54b45cb2a65575c7f5dc5408f5690"
SRC_URI[sha256sum] = "66bf0818229ae360cbde9b296a37d5bbbb168797115ed877f89d286f4b5baa32"
RDEPENDS_${PN} += "file-sharedir-perl"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "list-utilsby-perl"
RDEPENDS_${PN} += "perl"
RDEPENDS_${PN} += "scalar-list-utils-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
DEPENDS += "test-identity-perl-native"

S = "${WORKDIR}/Devel-MAT-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
