DESCRIPTION = "Net::SSLeay module contains perl bindings to openssl \
(<http://www.openssl.org>) library."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHRISN/Net-SSLeay-1.88.tar.gz \
	   file://no-exec-on-configure.patch \
"

SRC_URI[md5sum] = "fcef4985f5f7e0381e3dddd0ee7878d1"
SRC_URI[sha256sum] = "2000da483c8471a0b61e06959e92a6fca7b9e40586d5c828de977d3d2081cfdd"
DEPENDS = "zlib openssl"

S = "${WORKDIR}/Net-SSLeay-${PV}"

inherit cpan

do_configure() {
	export OPENSSL_PREFIX="${STAGING_EXECPREFIXDIR}"
	cpan_do_configure
}

BBCLASSEXTEND = "native"
