DESCRIPTION = "This module provides an XS implementation for portions of Class::Load. \
See Class::Load for API details."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Load-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-XS-0.09.tar.gz"

SRC_URI[md5sum] = "98eb8daf7f23c872fc7f503a7e34f598"
SRC_URI[sha256sum] = "bbec3b916df9e48827950a297bf53ef4dd59ed6376142099504307a42b553baa"
RDEPENDS_${PN} += "class-load-perl"
DEPENDS += "module-implementation-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Class-Load-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
