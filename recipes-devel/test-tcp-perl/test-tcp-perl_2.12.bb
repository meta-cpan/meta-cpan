DESCRIPTION = "Test::TCP is test utilities for TCP/IP programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-TCP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Test-TCP-2.12.tar.gz"

SRC_URI[md5sum] = "1fb2f960a593b79841040358f140f5a5"
SRC_URI[sha256sum] = "01e159e4b2d9e8a9846a721c892e6faa7effbb9ac4a1b46ae4672e9b7dc0c563"
RDEPENDS_${PN} += "test-sharedfork-perl"

S = "${WORKDIR}/Test-TCP-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
