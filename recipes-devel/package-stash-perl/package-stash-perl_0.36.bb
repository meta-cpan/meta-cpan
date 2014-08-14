DESCRIPTION = "Manipulating stashes (Perl's symbol tables) is occasionally necessary, \
but incredibly messy, and easy to get wrong. This module hides all of \
that \
behind a simple API."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-Stash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Package-Stash-0.36.tar.gz"

SRC_URI[md5sum] = "066aa5099af88457c4f1eb2448272061"
SRC_URI[sha256sum] = "a01cf48c7cd7a35e0d9ae4b1dc2702698397f55a2ce549d0bdacdc57ea6c73f1"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-implementation-perl"
RRECOMMENDS_${PN} += "package-stash-xs-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Package-Stash-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
