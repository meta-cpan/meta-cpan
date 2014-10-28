DESCRIPTION = "Are you sick of trying to remember whether a particular helper is \
defined in List::Util or List::MoreUtils? I sure am. Now you don't have \
to remember. \
This module will export all of the functions that either of those two \
modules defines."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-AllUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/List-AllUtils-0.09.tar.gz"

SRC_URI[md5sum] = "3e2dfeeef80c4e1952443c6b7d48583c"
SRC_URI[sha256sum] = "4cfe6359cc6c9f4ba0d178e223f4b468d3cf7768d645334962f05de069bdaee2"
RDEPENDS_${PN} += "list-moreutils-perl"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/List-AllUtils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
