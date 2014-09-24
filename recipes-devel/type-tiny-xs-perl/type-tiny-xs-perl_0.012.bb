DESCRIPTION = "This module is optionally used by Type::Tiny 0.045_03 and \
above to provide faster, C-based implementations of some type constraints. \
(This package has only core dependencies, and does not depend on \
Type::Tiny, so other data validation frameworks might also consider using \
it!)"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tiny-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tiny-XS-0.012.tar.gz"

SRC_URI[md5sum] = "3688be55a50f7ee430600e277b53f07b"
SRC_URI[sha256sum] = "a93ed33fd21646548ab5cdb0de647cc574ad3e41b414af7980526e8612cacb16"

S = "${WORKDIR}/Type-Tiny-XS-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
