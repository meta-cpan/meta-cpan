DESCRIPTION = "Net::SSLeay module contains perl bindings to openssl \
(<http://www.openssl.org>) library."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

DEPENDS = "zlib openssl openssl-native"
RDEPENDS_${PN} += "zlib libssl"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKEM/Net-SSLeay-1.84.tar.gz"

SRC_URI[md5sum] = "cfbe968487149626978f427cc9fb8c77"
SRC_URI[sha256sum] = "823ec3cbb428309d6a9e56f362a9300693ce3215b7fede109adb7be361fff177"

S = "${WORKDIR}/Net-SSLeay-${PV}"

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
