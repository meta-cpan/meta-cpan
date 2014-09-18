DESCRIPTION = "Are you sick of trying to remember whether a particular helper is \
defined in \"List::Util\" or \"List::MoreUtils\"? I sure am. Now you \
don't have to \
remember. This module will export all of the functions that either of \
those \
two modules defines."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-AllUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/List-AllUtils-0.08.tar.gz"

SRC_URI[md5sum] = "0becef45aaf3556685ab798a132c014e"
SRC_URI[sha256sum] = "27ddc2f0d47656cd3e08846ffe19f765bbd6c1d0e3c751ce4bb704e2b0b7ad1f"
RDEPENDS_${PN} += "list-moreutils-perl"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/List-AllUtils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
