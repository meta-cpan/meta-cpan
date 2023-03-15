DESCRIPTION = 'This module provides a syntax plugin that implements exception-handling \
semantics in a form familiar to users of other languages, being built on a \
block labeled with the "try" keyword, followed by at least one of a "catch" \
or "finally" block.'

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Syntax-Keyword-Try"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Syntax-Keyword-Try-0.18.tar.gz"

SRC_URI[md5sum] = "09e9391d67b91fc6a764362feeea7f21"
SRC_URI[sha256sum] = "24a10e8d6b1c5c1976a54dea2d007c2b60fa3a1e391ee0de0a845d79306a78ec"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Syntax-Keyword-Try-${PV}"

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${CCLD} ${LDFLAGS}""

inherit cpan_build

do_configure() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_configure
}

do_compile() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
