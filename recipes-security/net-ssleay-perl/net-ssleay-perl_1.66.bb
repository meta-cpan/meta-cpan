DESCRIPTION = "Net::SSLeay module contains perl bindings to openssl \
(<http://www.openssl.org>) library."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

DEPENDS= "zlib openssl"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIKEM/Net-SSLeay-1.66.tar.gz"

SRC_URI[md5sum] = "d18646abb41011607cbb0046c4fb0426"
SRC_URI[sha256sum] = "5bf8fd536d900da9d38a985417302fbb1ce4a8723e445f89028479273e6cae57"

S = "${WORKDIR}/Net-SSLeay-${PV}"

INSANE_SKIP_${PN} += "rpaths"

inherit cpan

do_configure() {
	export OPENSSL_PREFIX="${STAGING_DIR_TARGET}/usr"
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
