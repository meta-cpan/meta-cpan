DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can \
be logged to via a unified interface."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Log-Dispatch-2.42.tar.gz"

SRC_URI[md5sum] = "6fac830f8c063c790fda9652b29eedd0"
SRC_URI[sha256sum] = "6f5a377efee3af5fef9060de6ff7c490a37414f42eb9611e4eaff9ec89441eef"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"
RECOMMENDS += "perl"

S = "${WORKDIR}/Log-Dispatch-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
