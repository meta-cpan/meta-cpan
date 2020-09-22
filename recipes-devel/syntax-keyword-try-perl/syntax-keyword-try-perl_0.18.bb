DESCRIPTION = 'This module provides a syntax plugin that implements exception-handling \
semantics in a form familiar to users of other languages, being built on a \
block labeled with the "try" keyword, followed by at least one of a "catch" \
or "finally" block.'

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Syntax-Keyword-Try"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Syntax-Keyword-Try-0.18.tar.gz"

SRC_URI[md5sum] = "09e9391d67b91fc6a764362feeea7f21"
SRC_URI[sha256sum] = "24a10e8d6b1c5c1976a54dea2d007c2b60fa3a1e391ee0de0a845d79306a78ec"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Syntax-Keyword-Try-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}


BBCLASSEXTEND = "native"
